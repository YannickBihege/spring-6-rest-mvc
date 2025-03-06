package yannickb.springframework.spring_6_webapp.domain;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;


@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String laastName;

    @ManyToMany(mappedBy = "authors")
    private Set <Book> books;

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLaastName() {
        return laastName;
    }

    public void setLaastName(String laastName) {
        this.laastName = laastName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(getId(), author.getId()) && Objects.equals(getFirstName(), author.getFirstName()) && Objects.equals(getLaastName(), author.getLaastName()) && Objects.equals(getBooks(), author.getBooks());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLaastName(), getBooks());
    }

    @Override
    public String toString() {
        return "Author{" +
               "id=" + id +
               ", firstName='" + firstName + '\'' +
               ", laastName='" + laastName + '\'' +
               ", books=" + books +
               '}';
    }
}

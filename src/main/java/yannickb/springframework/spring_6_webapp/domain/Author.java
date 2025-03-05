package yannickb.springframework.spring_6_webapp.domain;

import jakarta.persistence.*;

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
}

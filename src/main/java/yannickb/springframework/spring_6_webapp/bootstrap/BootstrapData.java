package yannickb.springframework.spring_6_webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import yannickb.springframework.spring_6_webapp.domain.Author;
import yannickb.springframework.spring_6_webapp.domain.Book;
import yannickb.springframework.spring_6_webapp.repositiories.AuthorRepository;
import yannickb.springframework.spring_6_webapp.repositiories.BookRepository;

@Component
public class BootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        Author author = new Author();
        author.setFirstName("Yannick");
        author.setLaastName("Bihege");
        Book book = new Book();
        book.setTitle("Domain Driven Design");
        book.setName("Edition Xlo Domain Driven Design");

        Author author1 = new Author();
        author1.setFirstName("Heaven");
        author1.setLaastName("Keita");
        Book book1 = new Book();
        book1.setName("Edition clio Testing high performance applications");
        book1.setTitle("Testing hiogh performance applications");
    }
}

package yannickb.springframework.spring_6_webapp.repositiories;

import org.springframework.data.repository.CrudRepository;
import yannickb.springframework.spring_6_webapp.domain.Book;

public interface BookRepository extends CrudRepository <Book, Long> {
}

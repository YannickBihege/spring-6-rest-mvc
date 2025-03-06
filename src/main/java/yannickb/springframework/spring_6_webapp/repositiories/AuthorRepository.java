package yannickb.springframework.spring_6_webapp.repositiories;

import org.springframework.data.repository.CrudRepository;
import yannickb.springframework.spring_6_webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ab on 4/27/18.
 */
public interface BookRepository extends CrudRepository<Book,Long> {
}

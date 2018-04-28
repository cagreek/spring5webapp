package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ab on 4/27/18.
 */
public interface AuthorRepository  extends CrudRepository<Author,Long> {

}

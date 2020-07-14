package avrm.demo.springBootMvc.repositories;

import avrm.demo.springBootMvc.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

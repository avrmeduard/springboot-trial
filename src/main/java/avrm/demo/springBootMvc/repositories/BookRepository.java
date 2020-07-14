package avrm.demo.springBootMvc.repositories;

import avrm.demo.springBootMvc.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}

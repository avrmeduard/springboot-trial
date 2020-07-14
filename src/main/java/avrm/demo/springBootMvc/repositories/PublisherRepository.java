package avrm.demo.springBootMvc.repositories;

import avrm.demo.springBootMvc.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

package poseidon.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import poseidon.spring.domain.Author;
import poseidon.spring.domain.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}

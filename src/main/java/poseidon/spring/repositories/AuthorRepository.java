package poseidon.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import poseidon.spring.domain.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}

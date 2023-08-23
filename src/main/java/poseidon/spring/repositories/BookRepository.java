package poseidon.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import poseidon.spring.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}

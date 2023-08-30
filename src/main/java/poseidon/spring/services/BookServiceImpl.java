package poseidon.spring.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import poseidon.spring.domain.Book;
import poseidon.spring.repositories.BookRepository;

@AllArgsConstructor
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}

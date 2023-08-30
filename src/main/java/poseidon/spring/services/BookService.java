package poseidon.spring.services;

import poseidon.spring.domain.Book;

public interface BookService {

    Iterable<Book> findAll();

}

package poseidon.spring.services;

import poseidon.spring.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();

}

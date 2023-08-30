package poseidon.spring.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import poseidon.spring.domain.Author;
import poseidon.spring.repositories.AuthorRepository;

@AllArgsConstructor
@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}

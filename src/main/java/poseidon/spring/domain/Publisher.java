package poseidon.spring.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String publisherName;
    private String address;
    private String city;
    private String state;
    private String zipCode;

    @OneToMany(mappedBy = "publisher")
    private Set<Book> books;
}

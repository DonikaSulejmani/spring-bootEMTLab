package mk.ukim.finki.lab2_emt_191074.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import mk.ukim.finki.lab2_emt_191074.model.enumeration.Category;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    @ManyToOne
    private Country country;

    public Author(String name, String surname, Country country) {
        this.name = name;
        this.surname = surname;
        this.country = country;
    }


}

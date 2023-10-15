package vn.edu.iuh.fit.week_05.backend.models;

import com.neovisionaries.i18n.CountryCode;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "address")
public class Address {
    @Id
    @Column(name = "add_id", columnDefinition = "bigint(20)")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "city", columnDefinition = "varchar(50)")
    private String city;
    @Column(name = "country", columnDefinition = "smallint(6)")
    private CountryCode country;

    @Column(name = "zipcode", columnDefinition = "varchar(7)")
    private String zipCode;
    @Column(name = "street", columnDefinition = "varchar(150)")
    private String street;
    @Column(name = "number", columnDefinition = "varchar(20)")
    private String number;

    @OneToOne(mappedBy = "address")
    private Candidate candidate;
    @OneToOne(mappedBy = "address")
    private Company company;
}

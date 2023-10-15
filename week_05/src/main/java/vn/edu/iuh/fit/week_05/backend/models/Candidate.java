
package vn.edu.iuh.fit.week_05.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "candidate")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "can_id", columnDefinition = "bigint(20)")
    private long id;
    @Column(name = "phone", columnDefinition = "varchar(15)")
    private String phone;
    @Column(name = "dob", columnDefinition = "date")
    private LocalDate dob;
    @Column(name = "email")
    private String email;
    @Column(name = "full_name")
    private String fullName;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address")
    private Address address;
//    @OneToMany(mappedBy = "candidate", fetch = FetchType.LAZY)
//    private List<CandidateSkill> candidateSkills;
//    @OneToMany(mappedBy = "candidate", fetch = FetchType.LAZY)
//    private List<Experience> experiences;
}
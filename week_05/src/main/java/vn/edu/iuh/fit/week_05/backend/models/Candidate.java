
package vn.edu.iuh.fit.week_05.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

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
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "email")
    private String email;
    @Column(name = "phone", columnDefinition = "varchar(15)")
    private String phone;
    @Column(name = "dob", columnDefinition = "date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dob;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address")
    private Address address;
    @OneToMany(mappedBy = "candidate", fetch = FetchType.LAZY)
    private List<CandidateSkill> candidateSkills;
    @OneToMany(mappedBy = "candidate", fetch = FetchType.LAZY)
    private List<Experience> experiences;

    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address=" + address +
                ", candidateSkills=" + candidateSkills +
                ", experiences=" + experiences +
                '}';
    }
}
package vn.edu.iuh.fit.week_05.backend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "experience")
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exp_id", columnDefinition = "bigint(20)")
    private long id;
    @Column(name = "company", columnDefinition = "varchar(120)")
    private String companyName;
    @Column(name = "from_date", columnDefinition = "date")
    private LocalDate fromDate;
    @Column(name = "to_date", columnDefinition = "date")
    private LocalDate toDate;
    @Column(name = "role", columnDefinition = "varchar(100)")
    private String role;
    @Column(name = "work_desc", columnDefinition = "varchar(400)")
    private String worrkDesscription;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "can_id")
    private Candidate candidate;

    @Override
    public String toString() {
        return "Experience{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                ", role='" + role + '\'' +
                ", worrkDesscription='" + worrkDesscription + '\'' +
                ", candidate=" + candidate +
                '}';
    }
}

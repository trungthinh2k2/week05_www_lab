package vn.edu.iuh.fit.week_05.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "job")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id")
    private long id;
    @Column(name = "job_name", columnDefinition = "varchar(255)")
    private String name;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "com_id")
    private Company company;
//    @OneToMany(mappedBy = "job", fetch = FetchType.LAZY)
//    private List<JobSkill> jobSkills;
    @Column(name = "job_desc", columnDefinition = "varchar(2000)")
    private String description;
}

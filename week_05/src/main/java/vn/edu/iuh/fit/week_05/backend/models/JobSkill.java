package vn.edu.iuh.fit.week_05.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.edu.iuh.fit.week_05.backend.enums.SkillLevel;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "job_skill")
public class JobSkill {
    @Id
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "job_id")
    private Job job;
    @Id
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "skill_id")
    private Skill skill;
    @Column(name = "more_infos", columnDefinition = "varchar(1000)")
    private String moreInfo;

    @Enumerated(EnumType.STRING)
    private SkillLevel skillLevel;
}

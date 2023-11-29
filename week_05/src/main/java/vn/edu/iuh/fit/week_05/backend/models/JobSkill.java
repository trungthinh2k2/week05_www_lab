package vn.edu.iuh.fit.week_05.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.edu.iuh.fit.week_05.backend.enums.SkillLevel;
import vn.edu.iuh.fit.week_05.backend.ids.JobSkillId;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "job_skill")
@IdClass(JobSkillId.class)
public class JobSkill implements Serializable {
    @Id
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "job_id")
    private Job job;
    @Id
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "skill_id")
    private Skill skill;
    @Enumerated(EnumType.STRING)
    @Column(name = "skill_level")
    private SkillLevel skillLevel;
    @Column(name = "more_infos", columnDefinition = "varchar(1000)")
    private String moreInfo;
    @Override
    public String toString() {
        return "JobSkill{" +
                "job=" + job +
                ", skill=" + skill +
                ", moreInfo='" + moreInfo + '\'' +
                ", skillLevel=" + skillLevel +
                '}';
    }
}

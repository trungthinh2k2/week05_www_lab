package vn.edu.iuh.fit.week_05.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.edu.iuh.fit.week_05.backend.enums.SkillType;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "skill")
public class Skill {
    @Id
    @Column(name = "skill_id", columnDefinition = "bigint(20)")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Enumerated
    private SkillType skillType;
    @Column(name = "skill_name", columnDefinition = "varchar(150)")
    private String skillName;
    @Column(name = "skill_desc", columnDefinition = "varchar(300)")
    private String skillDescription;
    @OneToMany(mappedBy = "skill", fetch = FetchType.LAZY)
    private List<JobSkill> jobSkills;

    @Override
    public String toString() {
        return "Skill{" +
                "id=" + id +
                ", skillType=" + skillType +
                ", skillName='" + skillName + '\'' +
                ", skillDescription='" + skillDescription + '\'' +
                ", jobSkills=" + jobSkills +
                '}';
    }
}

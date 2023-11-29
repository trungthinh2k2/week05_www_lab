package vn.edu.iuh.fit.week_05.backend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.edu.iuh.fit.week_05.backend.enums.SkillLevel;
import vn.edu.iuh.fit.week_05.backend.ids.CandidateSkillId;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "candidate_skill")
@IdClass(CandidateSkillId.class)
public class CandidateSkill {
    @Id
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "can_id")
    private Candidate candidate;
    @Id
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "skill_id")
    private Skill skill;
    @Enumerated
    private SkillLevel skillLevel;
    @Column(name = "more_infos", columnDefinition = "varchar(1000)")
    private String moreInfo;

    @Override
    public String toString() {
        return "CandidateSkill{" +
                "skillLevel=" + skillLevel +
                ", skill=" + skill +
                ", candidate=" + candidate +
                ", moreInfo='" + moreInfo + '\'' +
                '}';
    }
}
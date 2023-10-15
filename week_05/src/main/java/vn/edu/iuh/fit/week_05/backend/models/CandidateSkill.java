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
@Table(name = "candidate_skill")
public class CandidateSkill {
    @Enumerated
    private SkillLevel skillLevel;
    @Id
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "skill_id")
    private Skill skill;
    @Id
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "can_id")
    private Candidate candidate;
    @Column(name = "more_infos", columnDefinition = "varchar(1000)")
    private String moreInfo;
}
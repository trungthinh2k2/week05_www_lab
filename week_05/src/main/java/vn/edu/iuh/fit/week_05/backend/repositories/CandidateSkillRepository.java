package vn.edu.iuh.fit.week_05.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.week_05.backend.models.CandidateSkill;
import vn.edu.iuh.fit.week_05.backend.models.Skill;

@Repository
public interface CandidateSkillRepository extends JpaRepository<CandidateSkill, Skill> {
}
package vn.edu.iuh.fit.week_05.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.week_05.backend.ids.JobSkillId;
import vn.edu.iuh.fit.week_05.backend.models.Job;
import vn.edu.iuh.fit.week_05.backend.models.JobSkill;

import java.util.Map;

@Repository
public interface JobSkillRepository extends JpaRepository<JobSkill, JobSkillId> {

}
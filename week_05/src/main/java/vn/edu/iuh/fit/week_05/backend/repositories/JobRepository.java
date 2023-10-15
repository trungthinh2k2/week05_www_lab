package vn.edu.iuh.fit.week_05.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.week_05.backend.models.Job;

public interface JobRepository extends JpaRepository<Job, Long> {
}
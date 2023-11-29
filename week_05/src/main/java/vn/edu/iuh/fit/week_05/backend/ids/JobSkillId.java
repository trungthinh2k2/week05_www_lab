package vn.edu.iuh.fit.week_05.backend.ids;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
public class JobSkillId implements Serializable {
    private long job;
    private long skill;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobSkillId that)) return false;
        return Objects.equals(job, that.job) && Objects.equals(skill, that.skill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(job, skill);
    }

}

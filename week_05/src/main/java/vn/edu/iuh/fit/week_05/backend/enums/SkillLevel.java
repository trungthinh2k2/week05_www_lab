package vn.edu.iuh.fit.week_05.backend.enums;

import lombok.Getter;

@Getter
public enum SkillLevel {

    BEGINER(1),
    IMTERMEDIATE(2),
    ADVANCED(3),
    PROFESSIONAL(4),
    MASTER(5);

    private final int level;

    SkillLevel(int level) {
        this.level = level;
    }
}

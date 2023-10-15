package vn.edu.iuh.fit.week_05.backend.enums;

import lombok.Getter;

@Getter
public enum SkillType {
    SOFT_SKILL(1),
    UNSPECIFIC(2),
    TECHNICAL_SKILL(3);

    private final int type;

    SkillType(int type) {
        this.type = type;
    }
}

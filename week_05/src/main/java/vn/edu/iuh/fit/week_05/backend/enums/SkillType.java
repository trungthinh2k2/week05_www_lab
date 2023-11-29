package vn.edu.iuh.fit.week_05.backend.enums;

import lombok.Getter;

@Getter
public enum SkillType {
    UNSPECIFIC(0),

    TECHNICAL_SKILL(1),

    SOFT_SKILL(2);

    private final int value;
    SkillType(int value) {
        this.value = value;
    }

}

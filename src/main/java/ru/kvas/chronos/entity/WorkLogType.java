package ru.kvas.chronos.entity;

import io.jmix.core.metamodel.datatype.EnumClass;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.Nullable;

@Getter
@RequiredArgsConstructor
public enum WorkLogType implements EnumClass<String> {

    CLOCK_IN("CLOCK_IN"),
    CLOCK_OUT("CLOCK_OUT"),
    FIELD_CHECKIN("FIELD_CHECKIN");

    private final String id;

    @Nullable
    public static WorkLogType fromId(String id) {
        for (WorkLogType at : WorkLogType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}
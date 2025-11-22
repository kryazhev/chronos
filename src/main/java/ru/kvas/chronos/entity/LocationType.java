package ru.kvas.chronos.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.Nullable;

@Getter
@RequiredArgsConstructor
public enum LocationType implements EnumClass<String> {

    OFFICE("OFFICE"),
    SHOP("SHOP"),
    WAREHOUSE("WAREHOUSE");

    private final String id;

    @Nullable
    public static LocationType fromId(String id) {
        for (LocationType at : LocationType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}
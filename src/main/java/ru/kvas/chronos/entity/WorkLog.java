package ru.kvas.chronos.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import jakarta.persistence.*;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@JmixEntity
@Table(name = "WORK_LOG")
@Entity
@Getter
@Setter
public class WorkLog {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @JoinColumn(name = "USER_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private User user;

    @Column(name = "TIMESTAMP_", nullable = false)
    private OffsetDateTime timestamp;

    @Column(name = "TYPE_", nullable = false)
    @NotNull
    private String type;

    @Column(name = "LATITUDE")
    private Double latitude;

    @Column(name = "LONGITUDE")
    private Double longitude;

    @Column(name = "PHOTO_URL")
    private String photoUrl;

    public WorkLogType getType() {
        return type == null ? null : WorkLogType.fromId(type);
    }

    public void setType(WorkLogType type) {
        this.type = type == null ? null : type.getId();
    }
}

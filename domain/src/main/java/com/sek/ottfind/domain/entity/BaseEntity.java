package com.sek.ottfind.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;

import java.time.LocalDateTime;

@MappedSuperclass
public class BaseEntity {
    private LocalDateTime createDt;

    private LocalDateTime modifyDt;

    private LocalDateTime deleteDt;
}

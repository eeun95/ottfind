package com.sek.ottfind.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;

import java.time.LocalDateTime;

@MappedSuperclass
public class BaseEntity {
    protected LocalDateTime createDt;

    protected LocalDateTime modifyDt;

    protected LocalDateTime deleteDt;
}

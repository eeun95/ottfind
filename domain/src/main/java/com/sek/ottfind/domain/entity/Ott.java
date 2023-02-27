package com.sek.ottfind.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Ott {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;                            // 시퀀스

    private OttCategoryEnum ottCategory;        // ott 카테고리

}

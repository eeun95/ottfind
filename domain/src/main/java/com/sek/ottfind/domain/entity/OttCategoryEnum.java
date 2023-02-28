package com.sek.ottfind.domain.entity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum OttCategoryEnum {
    NETFLIX("넷플릭스"),
    WATCHA("왓챠"),
    TIVING("티빙"),
    WAVE("웨이브"),
    DISNEY("디즈니플러스");

    private String name;
}

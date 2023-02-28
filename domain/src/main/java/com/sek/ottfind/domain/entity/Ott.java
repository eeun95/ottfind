package com.sek.ottfind.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Getter
public class Ott {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;                            // 시퀀스

    private OttCategoryEnum ottCategory;        // ott 카테고리

    @OneToMany(mappedBy = "ott")
    private List<OttContent> ottContentList;    // ott 컨텐츠 리스트

}

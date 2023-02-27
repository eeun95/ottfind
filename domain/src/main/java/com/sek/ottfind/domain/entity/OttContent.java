package com.sek.ottfind.domain.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class OttContent {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;                         // 시퀀스

    private Long ottId;                      // ott id

    private GenreEnum genre;                 // 장르

    @OneToMany(mappedBy = "ottContent")
    private List<ContentInfo> contentInfo;   // 컨텐츠 정보
}

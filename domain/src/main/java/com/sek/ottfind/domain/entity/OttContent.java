package com.sek.ottfind.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Getter
public class OttContent {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;                         // 시퀀스

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ott_id")
    private Ott ott;                         // ott

    private GenreEnum genre;                 // 장르

    @OneToMany(mappedBy = "ottContent")
    private List<ContentInfo> contentInfo;   // 컨텐츠 정보
}

package com.sek.ottfind.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Getter
public class OttContent {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;                         // 시퀀스

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "ott_id")
    private Ott ott;                         // ott

    @Enumerated(EnumType.STRING)
    private GenreEnum genre;                 // 장르

    private String title;                    // 제목

    private String description;              // 줄거리

    private String director;                 // 감독

    private String mainActor;                // 주연배우

    private String subActor;                 // 조연배우

    @OneToMany(mappedBy = "ottContent")
    private List<Review> review;             // 관련 리뷰
}

package com.sek.ottfind.domain.entity;

import jakarta.persistence.*;

@Entity
public class ContentInfo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;                // 시퀀스

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ott_content_id")
    private OttContent ottContent;  // ott

    private String title;           // 제목

    private String descript;        // 줄거리

    private String director;        // 감독

    private String mainActor;       // 주연배우

    private String subActor;        // 조연배우
}

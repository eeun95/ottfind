package com.sek.ottfind.domain.entity;

import jakarta.persistence.*;

@Entity
public class Review {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;                // 시퀀스

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "ott_content_id")
    private OttContent ottContent;  // ott

    private String url;             // 리뷰 url

    private String review;          // 리뷰내용
}

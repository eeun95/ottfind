package com.sek.ottfind.domain.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
public class Review extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;                // 시퀀스

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "ott_content_id")
    private OttContent ottContent;  // ott

    private String url;             // 리뷰 url

    @ColumnDefault(value = "0")
    private int grade;              // 별점 (max 5)

    private String review;          // 리뷰내용
}

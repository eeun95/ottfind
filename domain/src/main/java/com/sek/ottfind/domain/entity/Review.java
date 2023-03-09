package com.sek.ottfind.domain.entity;

import jakarta.persistence.*;
import lombok.Builder;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;

@Entity
public class Review extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;                // 시퀀스

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "ott_content_id")
    private OttContent ottContent;  // ott

    private String url;             // 리뷰 url

    @ColumnDefault(value = "0")
    private int starGrade;          // 별점 (max 5)

    private String comment;         // 리뷰내용

    @Builder
    public Review(String url, int starGrade, String comment) {
        this.url = url;
        this.starGrade = starGrade;
        this.comment = comment;
        super.createDt = LocalDateTime.now();
    }
    public void updateReview(String url, int starGrade, String comment) {
        this.url = url;
        this.starGrade = starGrade;
        this.comment = comment;
        super.modifyDt = LocalDateTime.now();
    }
    public void deleteReview() {
        super.deleteDt = LocalDateTime.now();
    }


    public void setOttContent(OttContent ottContent) {
        this.ottContent = ottContent;
    }
}

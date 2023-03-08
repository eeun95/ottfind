package com.sek.ottfind.domain.presentation;

import com.sek.ottfind.domain.entity.OttContent;
import com.sek.ottfind.domain.entity.Review;
import lombok.Builder;
import lombok.Getter;
import org.hibernate.annotations.ColumnDefault;

@Builder
@Getter
public class ReviewServiceDto {

    private Long id;                // 시퀀스

    private OttContent ottContent;  // ott

    private String url;             // 리뷰 url

    private int starGrade;          // 별점 (max 5)

    private String comment;         // 리뷰내용

}

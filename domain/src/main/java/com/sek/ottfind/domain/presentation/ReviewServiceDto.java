package com.sek.ottfind.domain.presentation;

import com.sek.ottfind.domain.entity.OttContent;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ReviewServiceDto {

    private Long id;                // 시퀀스

    private Long ottContentId;      // ottId

    private String url;             // 리뷰 url

    private int starGrade;          // 별점 (max 5)

    private String comment;         // 리뷰내용

}

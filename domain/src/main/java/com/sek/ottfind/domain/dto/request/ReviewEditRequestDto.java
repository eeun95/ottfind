package com.sek.ottfind.domain.dto.request;

import com.sek.ottfind.domain.entity.Review;
import com.sek.ottfind.domain.presentation.ReviewServiceDto;
import lombok.Data;

@Data
public class ReviewEditRequestDto {

    private Long reviewId;

    private String url;

    private int starGrade;

    private String comment;

    public ReviewServiceDto toServiceDto() {
        return ReviewServiceDto.builder()
                .id(this.reviewId)
                .url(this.url)
                .starGrade(this.starGrade)
                .comment(this.comment)
                .build();
    }
}

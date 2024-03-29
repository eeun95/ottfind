package com.sek.ottfind.domain.dto.request;

import com.sek.ottfind.domain.entity.Review;
import com.sek.ottfind.domain.presentation.ReviewServiceDto;
import lombok.Data;

@Data
public class ReviewInsertRequestDto {
    private Long ottContentId;

    private String url;

    private int starGrade;

    private String comment;

    public Review toEntity() {
        return Review.builder()
                .url(this.url)
                .starGrade(this.starGrade)
                .comment(this.comment)
                .build();
    }

    public ReviewServiceDto toServiceDto() {
        return ReviewServiceDto.builder()
                .ottContentId(this.ottContentId)
                .url(this.url)
                .starGrade(this.starGrade)
                .comment(this.comment)
                .build();
    }
}

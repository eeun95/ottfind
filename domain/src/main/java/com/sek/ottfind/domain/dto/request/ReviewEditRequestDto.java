package com.sek.ottfind.domain.dto.request;

import com.sek.ottfind.domain.entity.Review;
import lombok.Data;

@Data
public class ReviewEditRequestDto {

    private Long reviewId;

    private String url;

    private int starGrade;

    private String comment;

}

package com.sek.ottfind.api.service;

import com.sek.ottfind.domain.dto.request.ReviewEditRequestDto;
import com.sek.ottfind.domain.entity.OttContent;
import com.sek.ottfind.domain.entity.Review;
import com.sek.ottfind.domain.presentation.ReviewServiceDto;

import java.util.List;
import java.util.Optional;

public interface ReviewService {

    List<Review> list(OttContent ottContent);

    Review write(Review review);

    Review edit(ReviewServiceDto requestDto);

    void delete(Review review);

    Optional<Review> findOne(Long reviewId);
}

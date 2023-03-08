package com.sek.ottfind.api.service;

import com.sek.ottfind.domain.entity.OttContent;
import com.sek.ottfind.domain.entity.Review;

import java.util.List;
import java.util.Optional;

public interface ReviewService {

    List<Review> list(OttContent ottContent);

    Review write(Review review);

    Review edit(Review review);

    Review delete();

    Optional<Review> findOne(Long reviewId);
}

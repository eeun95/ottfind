package com.sek.ottfind.api.service;

import com.sek.ottfind.domain.entity.OttContent;
import com.sek.ottfind.domain.entity.Review;
import com.sek.ottfind.domain.repository.review.ReviewRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ReviewServiceImpl implements ReviewService{

    private final ReviewRepository reviewRepository;

    @Override
    public List<Review> list(OttContent ottContent) {
        return null;
    }

    @Override
    public Review write(Review review) {
        Review saveReview = reviewRepository.save(review);
        return saveReview;
    }

    @Override
    public Review edit() {
        return null;
    }

    @Override
    public Review delete() {
        return null;
    }
}

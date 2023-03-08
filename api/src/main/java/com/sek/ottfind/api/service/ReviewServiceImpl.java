package com.sek.ottfind.api.service;

import com.sek.ottfind.api.exception.ReviewNotFoundException;
import com.sek.ottfind.domain.dto.request.ReviewEditRequestDto;
import com.sek.ottfind.domain.entity.OttContent;
import com.sek.ottfind.domain.entity.Review;
import com.sek.ottfind.domain.repository.review.ReviewRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Review edit(ReviewEditRequestDto requestDto) {
        Review review = findOne(requestDto.getReviewId()).orElseThrow(ReviewNotFoundException::new);
        review.updateReview(requestDto.getUrl(), requestDto.getStarGrade(), requestDto.getComment());
        Review editReview = reviewRepository.save(review);
        return editReview;
    }

    @Override
    public Review delete() {
        return null;
    }

    @Override
    public Optional<Review> findOne(Long reviewId) {
        return reviewRepository.findByIdAndDeleteDtIsNull(reviewId);
    }
}

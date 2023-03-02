package com.sek.ottfind.api.service;

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
    public Optional<Review> write() {
        return Optional.empty();
    }

    @Override
    public Optional<Review> edit() {
        return Optional.empty();
    }

    @Override
    public Optional<Review> delete() {
        return Optional.empty();
    }
}

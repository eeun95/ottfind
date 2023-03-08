package com.sek.ottfind.domain.repository.review;

import com.sek.ottfind.domain.entity.OttContent;
import com.sek.ottfind.domain.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReviewRepository extends JpaRepository<Review, Long>, ReviewRepositoryCustom {
    Optional<Review> findByIdAndDeleteDtIsNull(Long reviewId);
}

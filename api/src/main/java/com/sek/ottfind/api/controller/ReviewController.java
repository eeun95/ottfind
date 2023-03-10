package com.sek.ottfind.api.controller;

import com.sek.ottfind.api.exception.ContentNotFoundException;
import com.sek.ottfind.api.exception.ReviewNotFoundException;
import com.sek.ottfind.api.service.OttListService;
import com.sek.ottfind.api.service.ReviewService;
import com.sek.ottfind.domain.common.CommonResponse;
import com.sek.ottfind.domain.common.ResultCode;
import com.sek.ottfind.domain.dto.request.ReviewEditRequestDto;
import com.sek.ottfind.domain.dto.request.ReviewInsertRequestDto;
import com.sek.ottfind.domain.entity.OttContent;
import com.sek.ottfind.domain.entity.Review;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("review")
public class ReviewController {

    private final ReviewService reviewService;

    private final OttListService ottListService;

    // 리뷰 조회
    @GetMapping("/{contentId}")
    public CommonResponse list(@PathVariable(name = "contentId") Long contentId) {
        OttContent ottContent = ottListService.content(contentId).orElseThrow(ContentNotFoundException::new);
        return new CommonResponse(ResultCode.SUCCESS, ottContent.getReview());
    }

    // 리뷰 등록
    @PostMapping("write")
    public CommonResponse write(ReviewInsertRequestDto requestDto) {
        OttContent ottContent = ottListService.content(requestDto.getOttContentId()).orElseThrow(ContentNotFoundException::new);
        Review review = requestDto.toEntity();
        review.setOttContent(ottContent);
        reviewService.write(review);
        return new CommonResponse(ResultCode.SUCCESS);
    }

    // 리뷰 수정
    @PutMapping("edit")
    public CommonResponse edit(ReviewEditRequestDto requestDto) {
        Review edit = reviewService.edit(requestDto.toServiceDto());
        return new CommonResponse(ResultCode.SUCCESS, edit);
    }

    // 리뷰 삭제
    @DeleteMapping("del/{reviewId}")
    public CommonResponse delete(@PathVariable Long reviewId) {
        Review review = reviewService.findOne(reviewId).orElseThrow(ReviewNotFoundException::new);
        reviewService.delete(review);
        return new CommonResponse(ResultCode.SUCCESS);
    }
}

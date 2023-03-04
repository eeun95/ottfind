package com.sek.ottfind.api.controller;

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

@RestController
@RequiredArgsConstructor
@RequestMapping("review")
public class ReviewController {

    private final ReviewService reviewService;

    private final OttListService ottListService;

    // 리뷰 조회
    @GetMapping("/{contentId}")
    public CommonResponse list(@PathVariable(name = "contentId") Long contentId) {
        OttContent ottContent = ottListService.content(contentId);
        if(ottContent == null) {
        }
        return new CommonResponse(ResultCode.SUCCESS, ottContent.getReview());
    }

    // 리뷰 등록
    @PostMapping("write")
    public CommonResponse write(ReviewInsertRequestDto requestDto) {
        OttContent ottContent = ottListService.content(requestDto.getOttContentId());
        Review review = requestDto.toEntity();
        review.setOttContent(ottContent);
        reviewService.write(review);
        return new CommonResponse(ResultCode.SUCCESS);
    }

    // 리뷰 수정
    @PutMapping("edit")
    public CommonResponse edit(ReviewEditRequestDto requestDto) {

        return new CommonResponse(ResultCode.SUCCESS);
    }

    // 리뷰 삭제
    @DeleteMapping("del")
    public CommonResponse delete() {

        return new CommonResponse(ResultCode.SUCCESS);
    }
}

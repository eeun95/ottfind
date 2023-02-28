package com.sek.ottfind.api.controller;

import com.sek.ottfind.api.service.OttContentService;
import com.sek.ottfind.api.service.OttContentServiceImpl;
import com.sek.ottfind.api.service.OttServiceImpl;
import com.sek.ottfind.domain.common.CommonResponse;
import com.sek.ottfind.domain.common.ResultCode;
import com.sek.ottfind.domain.dto.response.OttContentListResponseDto;
import com.sek.ottfind.domain.dto.response.OttListResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ott")
@RequiredArgsConstructor
public class OttController {

    private final OttServiceImpl ottListService;

    private final OttContentServiceImpl ottContentService;

    // OTT 리스트 출력
    @GetMapping("")
    public CommonResponse getList() {
        List<OttListResponseDto> response = ottListService.getList();
        return new CommonResponse(ResultCode.SUCCESS, response);
    }

    // 장르별 OTT 리스트 출력
    @GetMapping("/{genre}")
    public CommonResponse getContentList(@PathVariable String genre) {
        List<OttContentListResponseDto> response = ottContentService.getContentList(genre);
        return new CommonResponse(ResultCode.SUCCESS, response);
    }
}

package com.sek.ottfind.api.controller;

import com.sek.ottfind.api.service.OttListService;
import com.sek.ottfind.domain.common.CommonResponse;
import com.sek.ottfind.domain.common.ResultCode;
import com.sek.ottfind.domain.dto.response.OttContentResponseDto;
import com.sek.ottfind.domain.dto.response.OttListResponseDto;
import com.sek.ottfind.domain.entity.OttContent;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ott")
@RequiredArgsConstructor
public class OttController {

    private final OttListService ottListService;

    // 장르별 OTT 컨텐츠 리턴
    @GetMapping("")
    public CommonResponse list() {
        List<OttListResponseDto> list = ottListService.list();
        return new CommonResponse(ResultCode.SUCCESS, list);
    }

    // 특정 컨텐츠 리턴
    @GetMapping("/{contentId}")
    public CommonResponse content(@PathVariable(name="contentId") Long contentId) {
        OttContent content = ottListService.content(contentId);
        OttContentResponseDto response = new OttContentResponseDto(content);
        return new CommonResponse(ResultCode.SUCCESS, response);
    }
}

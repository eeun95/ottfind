package com.sek.ottfind.api.controller;

import com.sek.ottfind.api.service.OttService;
import com.sek.ottfind.domain.common.CommonResponse;
import com.sek.ottfind.domain.common.ResultCode;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ott")
@RequiredArgsConstructor
public class OttController {

    private final OttService ottService;

    @GetMapping("")
    public CommonResponse getList() {
        ottService.getList();
        return new CommonResponse(ResultCode.SUCCESS);
    }
}

package com.sek.ottfind.api.service;

import com.sek.ottfind.domain.dto.response.OttListResponseDto;

import java.util.List;

public interface OttService {
    List<OttListResponseDto> getList();

}

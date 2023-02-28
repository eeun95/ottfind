package com.sek.ottfind.api.service;

import com.sek.ottfind.domain.dto.response.OttContentListResponseDto;

import java.util.List;

public interface OttContentService {

    List<OttContentListResponseDto> getContentList(String genre);
}

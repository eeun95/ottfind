package com.sek.ottfind.api.service;

import com.sek.ottfind.domain.dto.response.OttContentResponseDto;
import com.sek.ottfind.domain.dto.response.OttListResponseDto;
import com.sek.ottfind.domain.entity.OttContent;

import java.util.List;
import java.util.Optional;

public interface OttListService {
    List<OttListResponseDto> list();

    Optional<OttContent> content(Long contentId);
}

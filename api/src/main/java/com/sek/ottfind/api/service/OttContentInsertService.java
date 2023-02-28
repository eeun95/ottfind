package com.sek.ottfind.api.service;

import com.sek.ottfind.domain.dto.request.OttContentRequestDto;
import com.sek.ottfind.domain.entity.OttContent;

import java.util.Optional;

public interface OttContentInsertService {
    Optional<OttContent> ottContentInsert(OttContentRequestDto requestDto);
}

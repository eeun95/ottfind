package com.sek.ottfind.api.service;

import com.sek.ottfind.domain.dto.request.OttContentRequestDto;
import com.sek.ottfind.domain.entity.OttContent;

import java.util.Optional;

public class OttContentInsertServiceImpl implements OttContentInsertService{
    @Override
    public Optional<OttContent> ottContentInsert(OttContentRequestDto requestDto) {
        return Optional.empty();
    }
}

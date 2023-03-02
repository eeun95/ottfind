package com.sek.ottfind.api.service;

import com.sek.ottfind.domain.dto.response.OttContentResponseDto;
import com.sek.ottfind.domain.dto.response.OttListResponseDto;
import com.sek.ottfind.domain.entity.OttContent;
import com.sek.ottfind.domain.repository.ott.OttRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class OttListServiceImpl implements OttListService{

    private final OttRepository ottRepository;

    @Override
    public List<OttListResponseDto> list() {
        List list = ottRepository.list();
        log.info("list {}", list.toString());
        return list;
    }

    @Override
    public OttContent content(Long contentId) {
        OttContent content = ottRepository.content(contentId);
        return content;
    }
}

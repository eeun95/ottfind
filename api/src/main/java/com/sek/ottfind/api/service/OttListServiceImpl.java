package com.sek.ottfind.api.service;

import com.sek.ottfind.domain.dto.response.OttListResponseDto;
import com.sek.ottfind.domain.repository.ott.OttRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

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
}

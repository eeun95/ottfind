package com.sek.ottfind.api.service;

import com.sek.ottfind.domain.dto.response.OttListResponseDto;
import com.sek.ottfind.domain.repository.OttRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OttServiceImpl implements OttService {

    private final OttRepository ottRepository;

    // OTT 리스트 출력
    @Override
    public List<OttListResponseDto> getList() {
        return ottRepository.findAll().stream()
                .map(OttListResponseDto::new)
                .collect(Collectors.toList());
    }
}

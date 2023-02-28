package com.sek.ottfind.api.service;

import com.sek.ottfind.domain.dto.response.OttContentListResponseDto;
import com.sek.ottfind.domain.repository.OttContentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OttContentServiceImpl implements OttContentService{

    private final OttContentRepository ottContentRepository;

    // 장르별 OTT 리스트 출력
    @Override
    public List<OttContentListResponseDto> getContentList(String genre) {
        return ottContentRepository.findByGenre(genre).stream()
                .map(OttContentListResponseDto::new)
                .collect(Collectors.toList());
    }
}

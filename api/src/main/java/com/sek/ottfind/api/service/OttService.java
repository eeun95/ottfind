package com.sek.ottfind.api.service;

import com.sek.ottfind.domain.dto.response.OttListResponse;
import com.sek.ottfind.domain.repository.OttRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OttService {

    private final OttRepository ottRepository;

    public List<OttListResponse> getList() {
        return ottRepository.findAll().stream()
                .map(OttListResponse::new)
                .collect(Collectors.toList());
    }
}

package com.sek.ottfind.domain.repository.ott;


import com.sek.ottfind.domain.dto.response.OttContentResponseDto;
import com.sek.ottfind.domain.entity.OttContent;

import java.util.List;
import java.util.Optional;

public interface OttRepositoryCustom {
    List list();

    Optional<OttContent> content(Long contentId);
}

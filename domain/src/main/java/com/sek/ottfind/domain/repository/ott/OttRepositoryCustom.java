package com.sek.ottfind.domain.repository.ott;


import com.sek.ottfind.domain.dto.response.OttContentResponseDto;
import com.sek.ottfind.domain.entity.OttContent;

import java.util.List;

public interface OttRepositoryCustom {
    List list();

    OttContent content(Long contentId);
}

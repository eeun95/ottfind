package com.sek.ottfind.domain.dto.response;

import com.sek.ottfind.domain.entity.Ott;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OttListResponseDto {

    private String ottName;

    public OttListResponseDto(Ott ott) {
        OttListResponseDto.builder()
                .ottName(ott.getOttCategory().name())
                .build();
    }
}

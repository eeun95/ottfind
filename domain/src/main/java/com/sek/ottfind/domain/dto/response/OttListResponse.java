package com.sek.ottfind.domain.dto.response;

import com.sek.ottfind.domain.entity.Ott;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OttListResponse {

    private String ottName;

    public OttListResponse(Ott ott) {
        OttListResponse.builder()
                .ottName(ott.getOttCategory().name())
                .build();
    }
}

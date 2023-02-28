package com.sek.ottfind.domain.dto.response;

import com.sek.ottfind.domain.entity.ContentInfo;
import com.sek.ottfind.domain.entity.OttContent;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class OttContentListResponseDto {

    private List<ContentInfo> contentInfoList;

    public OttContentListResponseDto(OttContent ottContent) {
        OttContentListResponseDto.builder()
                .contentInfoList(ottContent.getContentInfo())
                .build();
    }
}

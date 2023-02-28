package com.sek.ottfind.domain.dto.response;

import com.sek.ottfind.domain.entity.OttCategoryEnum;
import lombok.Data;

@Data
public class OttListResponseDto {

    private OttCategoryEnum ottCategory;

    private String title;

    private String description;
}

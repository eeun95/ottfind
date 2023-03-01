package com.sek.ottfind.domain.dto.response;

import com.sek.ottfind.domain.entity.GenreEnum;
import com.sek.ottfind.domain.entity.OttCategoryEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class OttListResponseDto {

    private OttCategoryEnum ottCategory;

    private GenreEnum genre;

    private String title;

    private String description;

}

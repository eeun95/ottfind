package com.sek.ottfind.domain.dto.response;

import com.sek.ottfind.domain.entity.GenreEnum;
import com.sek.ottfind.domain.entity.OttCategoryEnum;
import com.sek.ottfind.domain.entity.OttContent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OttContentResponseDto {

    private Long contentId;

    private GenreEnum genre;

    private String title;

    private String description;

    private String mainActor;

    private String subActor;

    public OttContentResponseDto(OttContent ottContent) {
        OttContentResponseDto.builder()
                .contentId(ottContent.getId())
                .genre(ottContent.getGenre())
                .title(ottContent.getTitle())
                .description(ottContent.getTitle())
                .mainActor(ottContent.getMainActor())
                .subActor(ottContent.getSubActor());
    }
}

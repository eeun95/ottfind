package com.sek.ottfind.domain.dto.response;

import com.sek.ottfind.domain.entity.GenreEnum;
import com.sek.ottfind.domain.entity.OttCategoryEnum;
import com.sek.ottfind.domain.entity.OttContent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
public class OttContentResponseDto {

    private Long contentId;

    private GenreEnum genre;

    private String title;

    private String description;

    private String mainActor;

    private String subActor;

    public OttContentResponseDto(OttContent ottContent) {
        this.contentId = ottContent.getId();
        this.genre = ottContent.getGenre();
        this.title = ottContent.getTitle();
        this.description = ottContent.getDescription();
        this.mainActor = ottContent.getMainActor();
        this.subActor = ottContent.getSubActor();
    }
}

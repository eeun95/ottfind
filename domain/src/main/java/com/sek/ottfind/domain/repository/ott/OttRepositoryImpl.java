package com.sek.ottfind.domain.repository.ott;

import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.sek.ottfind.domain.dto.response.OttContentResponseDto;
import com.sek.ottfind.domain.dto.response.OttListResponseDto;
import com.sek.ottfind.domain.entity.OttContent;
import com.sek.ottfind.domain.entity.QOttContent;
import jakarta.persistence.EntityManager;

import java.util.List;

import static com.sek.ottfind.domain.entity.QOtt.*;
import static com.sek.ottfind.domain.entity.QOttContent.*;
import static com.sek.ottfind.domain.entity.QOttContent.ottContent;

public class OttRepositoryImpl implements OttRepositoryCustom{

    private final JPAQueryFactory queryFactory;

    public OttRepositoryImpl(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(em);
    }

    @Override
    public List list() {
        List<OttListResponseDto> list = queryFactory
                .select(Projections.constructor(
                        OttListResponseDto.class,
                        ott.ottCategory, ottContent.genre, ottContent.title, ottContent.description))
                .from(ott)
                .join(ott.ottContent, ottContent)
                .fetch();
        return list;
    }

    @Override
    public OttContent content(Long contentId) {
        OttContent ottContent = queryFactory.selectFrom(QOttContent.ottContent)
                .where(QOttContent.ottContent.id.eq(contentId))
                .fetchOne();
        return ottContent;
    }
}

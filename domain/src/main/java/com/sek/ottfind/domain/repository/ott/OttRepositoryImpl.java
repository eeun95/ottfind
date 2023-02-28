package com.sek.ottfind.domain.repository.ott;

import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.sek.ottfind.domain.dto.response.OttListResponseDto;
import jakarta.persistence.EntityManager;

import java.util.List;

import static com.sek.ottfind.domain.entity.QOtt.*;
import static com.sek.ottfind.domain.entity.QOttContent.*;

public class OttRepositoryImpl implements OttRepositoryCustom{

    private final JPAQueryFactory queryFactory;

    public OttRepositoryImpl(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(em);
    }

    @Override
    public List list() {
        List<OttListResponseDto> list = queryFactory.select(Projections.constructor(OttListResponseDto.class, ott.ottCategory, ottContent.title, ottContent.description))
                .from(ott)
                .innerJoin(ottContent)
                .fetch();
        return list;
    }
}

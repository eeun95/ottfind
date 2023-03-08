package com.sek.ottfind.domain.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode implements Code {

    NOT_FOUND_OTT(404, "일치하는 OTT 서비스가 없습니다."),
    NOT_FOUND_OTT_CONTENT(404, "일치하는 OTT 프로그램이 없습니다."),
    NOT_FOUND_OTT_CONTENT_GENRE(404, "해당 장르의 OTT 프로그램이 없습니다."),
    NOT_FOUND_OTT_CONTENT_INFO(404, "해당하는 컨텐츠의 정보가 없습니다."),

    NOT_FOUND_REVIEW(404, "일치하는 리뷰가 없습니다.");

    private int code;
    private String message;
}

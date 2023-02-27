package com.sek.ottfind.domain.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode implements Code {

    SUCCESS(404, "일치하는 OTT 프로그램이 없습니다.");

    private int code;
    private String message;
}

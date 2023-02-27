package com.sek.ottfind.domain.entity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum GenreEnum {
    MOVIE("영화"),
    DRAMA("드라마"),
    ANIMATION("애니메이션"),
    DOCUMENTARY("다큐멘터리");

    private String name;

}

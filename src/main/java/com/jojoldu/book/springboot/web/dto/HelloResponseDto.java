package com.jojoldu.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloResponseDto {
    // lombok은 Getter, Setter, 기본생성자, toString 등을 어노테이션으로 자동 생성해줌
    private final String name;
    private final int amount;
}

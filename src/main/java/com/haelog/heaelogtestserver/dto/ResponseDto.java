package com.haelog.heaelogtestserver.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ResponseDto {
    private String result;

    private String msg;

    public ResponseDto(String result, String msg) {
        this.result = result;
        this.msg = msg;
    }
}

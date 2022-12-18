package com.haelog.heaelogtestserver.dto;

public class ResponseDto {
    private String result;

    private String msg;

    public String getResult() {
        return result;
    }

    public String getMsg() {
        return msg;
    }

    public ResponseDto(String result, String msg) {
        this.result = result;
        this.msg = msg;
    }
}

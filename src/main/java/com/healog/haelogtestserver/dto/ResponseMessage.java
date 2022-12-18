package com.healog.haelogtestserver.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseMessage {
    private String result;
    private String msg;
    private Object data;

    public ResponseMessage(String result, String msg, Object data) {
        this.result = result;
        this.msg = msg;
        this.data = data;
    }
}

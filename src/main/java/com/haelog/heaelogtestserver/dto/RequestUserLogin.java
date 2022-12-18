package com.haelog.heaelogtestserver.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class RequestUserLogin {
    private String loginId;
    private String password;
}

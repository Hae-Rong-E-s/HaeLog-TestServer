package com.haelog.heaelogtestserver.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ResponseUserLogin {
    private String loginId;

    private String password;

    public ResponseUserLogin(RequestUserLogin requestUserLogin) {
        this.loginId = requestUserLogin.getLoginId();
        this.password = requestUserLogin.getPassword();
    }
}

package com.haelog.heaelogtestserver.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ResponseUserSignup {
    private String loginId;

    private String password;

    private String nickname;

    private String description;

    public ResponseUserSignup(RequestUserSignup requestUserSignup) {
        this.loginId = requestUserSignup.getLoginId();
        this.password = requestUserSignup.getPassword();
        this.nickname = requestUserSignup.getNickname();
        this.description = requestUserSignup.getDescription();
    }
}

package com.haelog.heaelogtestserver.dto;

public class ResponseUserSignup {
    private String loginId;

    private String password;

    private String nickname;

    private String description;

    public String getLoginId() {
        return loginId;
    }

    public String getPassword() {
        return password;
    }

    public String getNickname() {
        return nickname;
    }

    public String getDescription() {
        return description;
    }

    public ResponseUserSignup(RequestUserSignup requestUserSignup) {
        this.loginId = requestUserSignup.getLoginId();
        this.password = requestUserSignup.getPassword();
        this.nickname = requestUserSignup.getNickname();
        this.description = requestUserSignup.getDescription();
    }
}

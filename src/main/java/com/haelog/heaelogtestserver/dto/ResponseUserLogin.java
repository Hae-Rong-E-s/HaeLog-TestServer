package com.haelog.heaelogtestserver.dto;

public class ResponseUserLogin {
    private String loginId;

    private String password;

    public String getLoginId() {
        return loginId;
    }

    public String getPassword() {
        return password;
    }

    public ResponseUserLogin(RequestUserLogin requestUserLogin) {
        this.loginId = requestUserLogin.getLoginId();
        this.password = requestUserLogin.getPassword();
    }
}

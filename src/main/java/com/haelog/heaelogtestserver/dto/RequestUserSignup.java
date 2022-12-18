package com.haelog.heaelogtestserver.dto;

public class RequestUserSignup {
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

}

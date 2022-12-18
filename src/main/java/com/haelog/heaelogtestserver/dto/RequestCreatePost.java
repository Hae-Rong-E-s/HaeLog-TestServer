package com.haelog.heaelogtestserver.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
public class RequestCreatePost {

    private String title;

    private String[] tag;

    private String content;
}

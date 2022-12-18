package com.healog.haelogtestserver.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
public class RequestPostDto {
    private String title;
    private String tag;
    private String content;
}

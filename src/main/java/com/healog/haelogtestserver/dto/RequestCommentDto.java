package com.healog.haelogtestserver.dto;

import com.healog.haelogtestserver.entity.Comment;
import lombok.Getter;

@Getter
public class RequestCommentDto {
    private String comment;

    public Comment toEntity(String username) {
        return Comment.builder()
                .username(username)
                .comment(comment)
                .build();
    }
}
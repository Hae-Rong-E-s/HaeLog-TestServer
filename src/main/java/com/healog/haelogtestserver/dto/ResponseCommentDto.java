package com.healog.haelogtestserver.dto;

import com.healog.haelogtestserver.entity.Comment;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class ResponseCommentDto {
    private Long id;
    private String username;
    private String reply;
    private LocalDateTime createAt;

    public ResponseCommentDto(Comment comment) {
        this.id = comment.getId();
        this.username = comment.getUsername();
        this.reply = comment.getComment();
        this.createAt = comment.getCreatedAt();
    }
}
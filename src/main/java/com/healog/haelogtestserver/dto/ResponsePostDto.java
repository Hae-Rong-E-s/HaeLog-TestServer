package com.healog.haelogtestserver.dto;

import com.healog.haelogtestserver.entity.Comment;
import com.healog.haelogtestserver.entity.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
public class ResponsePostDto {
    private Long postId;
    private String title;
    private String postContent;
    private String author;
    private LocalDateTime createdAt;
    private List<ResponseCommentDto> commnetList = new ArrayList<>();

    public ResponsePostDto(Post post) {
        this.postId = post.getId();
        this.title = post.getTitle();
        this.postContent = post.getContent();
        this.author = post.getUsername();
        this.createdAt = post.getCreatedAt();
    }

    public ResponsePostDto(Post post, List<ResponseCommentDto> commnetList) {
        this(post);
        this.commnetList =  commnetList;
    }


}
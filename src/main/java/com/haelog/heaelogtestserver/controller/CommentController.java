package com.haelog.heaelogtestserver.controller;

import com.haelog.heaelogtestserver.dto.RequestCreatePost;
import com.haelog.heaelogtestserver.dto.ResponseDto;
import com.haelog.heaelogtestserver.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CommentController {

    private final CommentService commentService;

    @PutMapping("/post/{commentId}/comment")
    public ResponseDto createComment(@PathVariable Long commentId) {
        return commentService.createComment(commentId);
    }

    @PutMapping("/post/comment/{commentId}")
    public ResponseDto updateComment(@PathVariable Long commentId) {
        return commentService.updateComment(commentId);
    }

    @DeleteMapping("/post/comment/{commentId}")
    public ResponseDto deletePost(@PathVariable Long commentId) {
        return commentService.deleteComment(commentId);
    }
}

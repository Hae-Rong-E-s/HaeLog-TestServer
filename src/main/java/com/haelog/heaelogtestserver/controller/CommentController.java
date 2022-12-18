package com.haelog.heaelogtestserver.controller;

import com.haelog.heaelogtestserver.dto.RequestCreatePost;
import com.haelog.heaelogtestserver.dto.ResponseDto;
import com.haelog.heaelogtestserver.service.CommentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PutMapping("/post/{postId}/comment")
    public ResponseDto creatComment(@PathVariable Long postId, @RequestBody RequestCreatePost requestCreatePost) {

    }

    @PutMapping("/post/comment/{commentId}")
    public ResponseDto updatePost(@PathVariable Long commentId, @RequestBody RequestUpdatePost requestUpdatePost) {

    }

    @DeleteMapping("/post/comment/{commentId}")
    public ResponseDto deletePost(@PathVariable Long commentId, @RequestBody RequestDeletePost requestDeletePost) {

    }
}

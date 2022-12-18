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

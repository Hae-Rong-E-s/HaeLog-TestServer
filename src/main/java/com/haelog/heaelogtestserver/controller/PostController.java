package com.haelog.heaelogtestserver.controller;

import com.haelog.heaelogtestserver.dto.RequestCreatePost;
import com.haelog.heaelogtestserver.dto.ResponseDto;
import com.haelog.heaelogtestserver.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PutMapping("/post")
    public ResponseDto creatPost(@RequestBody RequestCreatePost requestCreatePost) {

    }

    @GetMapping("/post/{userId}")
    public ResponseDto readUserPost(@PathVariable Long userId) {
        return postService.readUserPost();
    }

    @GetMapping("/post/{postId}")
    public ResponseDto readPost(@PathVariable Long postId) {

    }

    @PutMapping("/post/{postId}")
    public ResponseDto updatePost(@PathVariable Long postId, @RequestBody RequestUpdatePost requestUpdatePost) {

    }

    @DeleteMapping("/post/{postId}")
    public ResponseDto deletePost(@PathVariable Long postId, @RequestBody RequestDeletePost requestDeletePost) {

    }
}

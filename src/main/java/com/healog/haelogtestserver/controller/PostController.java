package com.healog.haelogtestserver.controller;

import com.healog.haelogtestserver.dto.RequestPostDto;
import com.healog.haelogtestserver.dto.ResponseMessage;
import com.healog.haelogtestserver.service.PostService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @PostMapping("/post")
    public ResponseEntity<ResponseMessage> createPost(@RequestBody RequestPostDto requestPostDto) {
        postService.createPost(requestPostDto);
        ResponseMessage responseMessage = new ResponseMessage("success", "게시물 등록이 완료되었습니다.", null);
        return new ResponseEntity<ResponseMessage>(responseMessage, HttpStatus.OK);
    }

    @PutMapping("/post/{postId}")
    public ResponseEntity<ResponseMessage> updatePost(@PathVariable Long postId, @RequestBody RequestPostDto requestPostDto) {
        postService.updatePost(postId, requestPostDto);
        ResponseMessage responseMessage = new ResponseMessage("success", "게시물 수정이 완료되었습니다.", null);
        return new ResponseEntity<ResponseMessage>(responseMessage, HttpStatus.OK);
    }

    @DeleteMapping("/post/{postId}")
    public ResponseEntity<ResponseMessage> deletePost(@PathVariable Long postId) {
        postService.deletePost(postId);
        ResponseMessage responseMessage = new ResponseMessage("success", "게시물 삭제가 완료되었습니다.", null);
        return new ResponseEntity<ResponseMessage>(responseMessage, HttpStatus.OK);
    }
}

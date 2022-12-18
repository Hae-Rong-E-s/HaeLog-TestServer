package com.healog.haelogtestserver.controller;

import com.healog.haelogtestserver.dto.RequestPostDto;

import com.healog.haelogtestserver.dto.ResponseMessage;
import com.healog.haelogtestserver.dto.ResponsePostDto;
import com.healog.haelogtestserver.dto.ResponsePostListDto;
import com.healog.haelogtestserver.service.PostService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Api(tags = {"게시글 API"})
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @ApiOperation(value = "게시글 작성")
    @PostMapping("/post")
    public ResponseEntity<ResponseMessage> createPost(@RequestBody RequestPostDto requestPostDto) {
        postService.createPost(requestPostDto);
        ResponseMessage responseMessage = new ResponseMessage("success", "게시물 등록이 완료되었습니다.", null);
        return new ResponseEntity<ResponseMessage>(responseMessage, HttpStatus.OK);
    }

    @ApiOperation(value = "게시글 상세 조회")
    @GetMapping("/post/{postId}")
    public ResponseEntity<ResponseMessage> readOnePost(@PathVariable Long postId) {
        ResponsePostDto responsePostDto = postService.readOnePost(postId);
        ResponseMessage responseMessage = new ResponseMessage("success", "게시물 조회 성공", responsePostDto);

        return new ResponseEntity<>(responseMessage, HttpStatus.OK);
    }

    @ApiOperation(value = "한 명의 유저가 작성한 게시글 전체 조회")
    @GetMapping("/post/user/{userId}")
    public ResponseEntity<ResponseMessage> readUserPost(@PathVariable Long userId) {
        ResponsePostListDto responsePostListDto = postService.readUserPost(userId);
        ResponseMessage responseMessage = new ResponseMessage("success", "게시물 조회 성공", responsePostListDto);

        return new ResponseEntity<ResponseMessage>(responseMessage, HttpStatus.OK);
    }


    @ApiOperation(value = "게시글 수정")
    @PutMapping("/post/{postId}")
    public ResponseEntity<ResponseMessage> updatePost(@PathVariable Long postId, @RequestBody RequestPostDto requestPostDto) {
        postService.updatePost(postId, requestPostDto);
        ResponseMessage responseMessage = new ResponseMessage("success", "게시물 수정이 완료되었습니다.", null);
        return new ResponseEntity<ResponseMessage>(responseMessage, HttpStatus.OK);
    }

    @ApiOperation(value = "게시글 삭제")
    @DeleteMapping("/post/{postId}")
    public ResponseEntity<ResponseMessage> deletePost(@PathVariable Long postId) {
        postService.deletePost(postId);
        ResponseMessage responseMessage = new ResponseMessage("success", "게시물 삭제가 완료되었습니다.", null);
        return new ResponseEntity<ResponseMessage>(responseMessage, HttpStatus.OK);
    }
}

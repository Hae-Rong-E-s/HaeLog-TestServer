package com.healog.haelogtestserver.controller;

import com.healog.haelogtestserver.dto.RequestCommentDto;
import com.healog.haelogtestserver.dto.ResponseCommentDto;
import com.healog.haelogtestserver.dto.ResponseMessage;
import com.healog.haelogtestserver.entity.Member;
import com.healog.haelogtestserver.service.CommentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Api(tags = {"댓글 API"})
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/post")
public class CommentController {

    private final CommentService commentService;

    @ApiOperation(value = "댓글 작성")
    @PostMapping("/{postId}/comment")
    public ResponseEntity<ResponseMessage> writeComment(
            @PathVariable Long postId,
            @RequestBody RequestCommentDto requestCommentDto
    ) {
        ResponseCommentDto responseCommentDto = commentService.writeComment(postId, requestCommentDto);

        ResponseMessage responseMessage = new ResponseMessage("success", "댓글 작성에 성공하였습니다.", responseCommentDto);
        return new ResponseEntity<>(responseMessage, HttpStatus.OK);
    }

    @ApiOperation(value = "댓글 수정")
    @PutMapping("/post/comment/{commentId}")
    public ResponseEntity<ResponseMessage> updateComment(
            @PathVariable Long commentId,
            @RequestBody RequestCommentDto requestCommentDto
    ) {
        ResponseCommentDto responseCommentDto = commentService.updateComment(commentId, requestCommentDto);

        ResponseMessage responseMessage = new ResponseMessage("success", "댓글 수정 완료", responseCommentDto);
        return new ResponseEntity<>(responseMessage, HttpStatus.OK);
    }

    @ApiOperation(value = "댓글 삭제")
    @DeleteMapping("/post/comment/{commentId}")
    public ResponseEntity<ResponseMessage> deleteComment(
            @PathVariable Long commentId
    ) {
        commentService.deleteComment(commentId);

        ResponseMessage responseMessage = new ResponseMessage("success", "댓글 삭제 완료", null);
        return new ResponseEntity<>(responseMessage, HttpStatus.OK);
    }



}
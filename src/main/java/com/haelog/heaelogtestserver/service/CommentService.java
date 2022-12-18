package com.haelog.heaelogtestserver.service;

import com.haelog.heaelogtestserver.dto.ResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentService {

    public ResponseDto createComment(Long commentId) {
        return new ResponseDto("success", "댓글 작성에 성공하였습니다.");
    }

    public ResponseDto updateComment(Long commentId) {
        return new ResponseDto("success", "댓글 수정이 성공하였습니다.");
    }

    public ResponseDto deleteComment(Long commentId) {
        return new ResponseDto("success", "댓글 삭제가 완료되었습니다.");
    }
}

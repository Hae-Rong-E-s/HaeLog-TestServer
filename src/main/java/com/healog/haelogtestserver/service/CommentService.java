package com.healog.haelogtestserver.service;


import com.healog.haelogtestserver.dto.RequestCommentDto;
import com.healog.haelogtestserver.dto.ResponseCommentDto;
import com.healog.haelogtestserver.entity.Comment;
import com.healog.haelogtestserver.entity.Post;
import com.healog.haelogtestserver.repository.CommentRepository;
import com.healog.haelogtestserver.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;
    private final PostRepository postRepository;

    @Transactional
    public ResponseCommentDto writeComment(Long postId, RequestCommentDto requestCommentDto) {
        Post post = checkPost(postId);

        Comment comment = new Comment(requestCommentDto, post);
        commentRepository.save(comment);


        post.addComment(comment);

        return new ResponseCommentDto(comment);
    }

    @Transactional
    public ResponseCommentDto updateComment(Long commentId, RequestCommentDto requestCommentDto) {

        String beforeComment = requestCommentDto.getComment();

        Comment comment = checkComment(commentId);
        comment.update(beforeComment);

        return new ResponseCommentDto(comment);
    }

    public void deleteComment(Long commentId) {

        Comment comment = checkComment(commentId);

        commentRepository.delete(comment);
    }

    // 댓글 존재 여부 확인 메서드
    private Comment checkComment(Long commentId) {
        return commentRepository.findById(commentId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않은 댓글입니다."));
    }

    // 게시물 존재 여부 확인 메서드
    private Post checkPost(Long postId) {
        return postRepository.findById(postId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않은 게시물입니다."));
    }
}

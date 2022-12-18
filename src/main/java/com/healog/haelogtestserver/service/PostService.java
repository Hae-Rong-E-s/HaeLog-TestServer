package com.healog.haelogtestserver.service;

import com.healog.haelogtestserver.dto.RequestPostDto;
import com.healog.haelogtestserver.dto.ResponseCommentDto;
import com.healog.haelogtestserver.dto.ResponsePostDto;
import com.healog.haelogtestserver.dto.ResponsePostListDto;
import com.healog.haelogtestserver.entity.Comment;
import com.healog.haelogtestserver.entity.Post;
import com.healog.haelogtestserver.repository.CommentRepository;
import com.healog.haelogtestserver.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    private final CommentRepository commentRepository;

    @Transactional
    public void createPost(RequestPostDto requestPostDto) {
        Post post = new Post(requestPostDto);
        postRepository.save(post);
    }

    @Transactional
    public void updatePost(Long postId, RequestPostDto requestPostDto) {
        Post post = postRepository.findById(postId).orElseThrow();

        post.updatePost(requestPostDto);
    }

    @Transactional
    public void deletePost(Long postId) {
        Post post = postRepository.findById(postId).orElseThrow();

        postRepository.delete(post);
    }

    @Transactional(readOnly = true)
    public ResponsePostDto readOnePost(Long postId) {
        Post post = checkPost(postId);
        List<Comment> commetList = commentRepository.findAllByPost_IdOrderByModifiedAtDesc(postId);

        List<ResponseCommentDto> comments = new ArrayList<>();

        for (Comment comment : commetList) {
            comments.add(new ResponseCommentDto(comment));
        }

        return new ResponsePostDto(post, comments);
    }

//    @Transactional(readOnly = true)
//    public ResponsePostDto readOnePost(Long postId) {
//        Post post = checkPost(postId);
//        return new ResponsePostDto(post);
//    }

    @Transactional(readOnly = true)
    public ResponsePostListDto readUserPost(Long userId) {
        ResponsePostListDto responsePostListDto = new ResponsePostListDto();
        List<Post> postList = postRepository.findAllById(Collections.singleton(userId));



        for (Post post : postList) {
            responsePostListDto.addPost(new ResponsePostDto(post));
        }

        return responsePostListDto;
    }

    // 게시물 존재 여부 확인 메서드
    private Post checkPost(Long postId) {
        return postRepository.findById(postId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않은 게시물입니다."));
    }


}

package com.healog.haelogtestserver.service;

import com.healog.haelogtestserver.dto.RequestPostDto;
import com.healog.haelogtestserver.dto.ResponsePostDto;
import com.healog.haelogtestserver.entity.Post;
import com.healog.haelogtestserver.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

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
        return new ResponsePostDto(post);
    }

    // 게시물 존재 여부 확인 메서드
    private Post checkPost(Long postId) {
        return postRepository.findById(postId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않은 게시물입니다."));
    }
}

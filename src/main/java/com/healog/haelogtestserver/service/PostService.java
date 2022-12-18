package com.healog.haelogtestserver.service;

import com.healog.haelogtestserver.dto.RequestPostDto;
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
}

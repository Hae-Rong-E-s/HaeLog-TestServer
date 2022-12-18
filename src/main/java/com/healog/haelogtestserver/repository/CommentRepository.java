package com.healog.haelogtestserver.repository;

import com.healog.haelogtestserver.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByPost_IdOrderByModifiedAtDesc(Long id);
}
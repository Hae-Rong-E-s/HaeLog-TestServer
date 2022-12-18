package com.healog.haelogtestserver.repository;

import com.healog.haelogtestserver.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}

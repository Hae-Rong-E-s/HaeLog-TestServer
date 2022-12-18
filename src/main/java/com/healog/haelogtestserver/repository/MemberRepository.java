package com.healog.haelogtestserver.repository;

import com.haelog.heaelogtestserver.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}

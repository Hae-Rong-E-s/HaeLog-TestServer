package com.healog.haelogtestserver.repository;


import com.healog.haelogtestserver.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}

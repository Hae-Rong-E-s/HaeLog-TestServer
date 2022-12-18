package com.healog.haelogtestserver.service;

import com.haelog.heaelogtestserver.dto.RequestMemberDto;
import com.haelog.heaelogtestserver.entity.Member;
import com.haelog.heaelogtestserver.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public void signup(RequestMemberDto requestMemberDto) {
        Member member = new Member(requestMemberDto);
        memberRepository.save(member);
    }
}

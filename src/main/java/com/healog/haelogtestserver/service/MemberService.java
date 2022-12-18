package com.healog.haelogtestserver.service;

import com.healog.haelogtestserver.dto.RequestMemberDto;
import com.healog.haelogtestserver.entity.Member;
import com.healog.haelogtestserver.repository.MemberRepository;
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

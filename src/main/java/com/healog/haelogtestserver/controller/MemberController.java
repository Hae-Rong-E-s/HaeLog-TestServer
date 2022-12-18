package com.healog.haelogtestserver.controller;

import com.healog.haelogtestserver.dto.RequestMemberDto;
import com.healog.haelogtestserver.dto.ResponseMessage;
import com.healog.haelogtestserver.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/member")
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/login")
    public ResponseEntity<ResponseMessage> login(@RequestBody RequestMemberDto requestMemberDto) {
        ResponseMessage responseMessage = new ResponseMessage("success", "로그인 완료이 완료되었습니다.", null);
        return new ResponseEntity<>(responseMessage, HttpStatus.OK);
    }

    @PostMapping("/signup")
    public ResponseEntity<ResponseMessage> signup(@RequestBody RequestMemberDto requestMemberDto) {
        ResponseMessage responseMessage = new ResponseMessage("success", "회원가입이 완료되었습니다.", null);
        memberService.signup(requestMemberDto);
        return new ResponseEntity<>(responseMessage, HttpStatus.OK);
    }
}

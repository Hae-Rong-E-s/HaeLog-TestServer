package com.haelog.heaelogtestserver.service;

import com.haelog.heaelogtestserver.dto.*;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public ResponseDto signup(RequestUserSignup requestUserSignup) {
        ResponseUserSignup responseUserSignup = new ResponseUserSignup(requestUserSignup);
        return new ResponseDto("success", "회원가입이 완료되었습니다.") ;
    }

    public ResponseDto login(RequestUserLogin requestUserLogin) {
        ResponseUserLogin responseUserLogin = new ResponseUserLogin(requestUserLogin);
        return new ResponseDto("success", "로그인이 완료되었습니다.");
    }
}
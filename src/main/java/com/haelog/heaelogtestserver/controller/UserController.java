package com.haelog.heaelogtestserver.controller;

import com.haelog.heaelogtestserver.dto.RequestUserLogin;
import com.haelog.heaelogtestserver.dto.RequestUserSignup;
import com.haelog.heaelogtestserver.dto.ResponseDto;
import com.haelog.heaelogtestserver.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/member/signup")
    public ResponseDto signup(@RequestBody RequestUserSignup requestUserSignup) {
        return userService.signup(requestUserSignup);
    }

    @PostMapping("/member/login")
    public ResponseDto login(@RequestBody RequestUserLogin requestUserLogin) {
        return userService.login(requestUserLogin);
    }
}

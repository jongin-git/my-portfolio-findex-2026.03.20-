package com.sb10findexteam6.global.health;

import com.sb10findexteam6.global.exception.CustomException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/test-error")
    public String testError() {
        throw new CustomException("테스트 예외입니다.");
    }
}
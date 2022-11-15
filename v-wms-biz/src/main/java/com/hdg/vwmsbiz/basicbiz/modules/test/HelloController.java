package com.hdg.vwmsbiz.basicbiz.modules.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/biz")
public class HelloController {
    @GetMapping("/test1")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/test")
    public String testStr() {
        return "나오길!";
    }
}

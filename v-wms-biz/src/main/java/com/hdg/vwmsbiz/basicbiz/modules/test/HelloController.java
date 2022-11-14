package com.hdg.vwmsbiz.basicbiz.modules.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/test")
    public String testStr() {
        return "나오길!";
    }
}

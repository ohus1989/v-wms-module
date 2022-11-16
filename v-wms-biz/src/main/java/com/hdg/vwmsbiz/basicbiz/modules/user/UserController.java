package com.hdg.vwmsbiz.basicbiz.modules.user;

import com.hdg.vwmsbiz.basicbiz.vo.user.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/basicbiz/user")
public class UserController {
    @Autowired
    UserService service;


    @GetMapping("/")
    public List<UserVo> getUser() {
        return service.getUser();
    }
    @GetMapping("/test1")
    public String getUserTest1() {
        return "getUser1";
    }
}

package com.hdg.vwmsbiz.basicbiz.modules.user;

import com.hdg.vwmsbiz.basicbiz.vo.user.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo repo;

    public List<UserVo> getUser(){
        return repo.getUser();
    }
}

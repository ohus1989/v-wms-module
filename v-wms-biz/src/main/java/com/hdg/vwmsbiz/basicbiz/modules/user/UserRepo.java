package com.hdg.vwmsbiz.basicbiz.modules.user;

import com.hdg.vwmsbiz.basicbiz.vo.user.UserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserRepo {
    List<UserVo> getUser();
}

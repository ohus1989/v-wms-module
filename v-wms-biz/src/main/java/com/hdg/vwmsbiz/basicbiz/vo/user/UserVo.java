package com.hdg.vwmsbiz.basicbiz.vo.user;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class UserVo {
    String userId;
    String name;
    String pwd;
    String company;
    Date createTime;
    Date lastUpdateTime;
}

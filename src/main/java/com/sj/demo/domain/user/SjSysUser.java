package com.sj.demo.domain.user;

import lombok.Data;

/*
 * @Author: daixq
 * @Date: 2021/4/6 9:07
 * @Description:
 **/
@Data
public class SjSysUser {

    private Integer id;
    private String userCode;
    private String userName;
    private String password;
    private String salt;
}

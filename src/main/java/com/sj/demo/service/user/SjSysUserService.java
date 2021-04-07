package com.sj.demo.service.user;

import com.sj.demo.domain.user.SjSysUser;
import com.sj.demo.domain.user.vo.SjSysUserSearchVo;

import java.util.List;

/*
 * @Author: daixq
 * @Date: 2021/4/7 16:59
 * @Description:
 **/
public interface SjSysUserService {

    List<SjSysUser> queryUser(SjSysUserSearchVo vo);
}

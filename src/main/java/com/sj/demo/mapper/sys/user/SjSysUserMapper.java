package com.sj.demo.mapper.sys.user;

import com.sj.demo.domain.user.SjSysUser;
import com.sj.demo.domain.user.vo.SjSysUserSearchVo;

import java.util.List;

public interface SjSysUserMapper {
    List<SjSysUser> queryUser(SjSysUserSearchVo vo);

    int insert(SjSysUser sjSysUser);

    int update(SjSysUser sjSysUser);
}
package com.sj.demo.service.user.impl;

import com.sj.demo.domain.user.SjSysUser;
import com.sj.demo.domain.user.vo.SjSysUserSearchVo;
import com.sj.demo.mapper.sys.user.SjSysUserMapper;
import com.sj.demo.service.user.SjSysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
 * @Author: daixq
 * @Date: 2021/4/7 16:59
 * @Description:
 **/
@Service
public class SjSysUserServiceImpl implements SjSysUserService {

    @Resource
    private SjSysUserMapper sjSysUserMapper;

    @Override
    public List<SjSysUser> queryUser(SjSysUserSearchVo vo) {
        return sjSysUserMapper.queryUser(vo);
    }

    @Override
    public int insert(SjSysUser sjSysUser) {
        return sjSysUserMapper.insert(sjSysUser);
    }

    @Override
    public int update(SjSysUser sjSysUser) {
        return sjSysUserMapper.update(sjSysUser);
    }
}

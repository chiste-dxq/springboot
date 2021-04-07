package com.sj.demo.controller.user;

import com.github.pagehelper.PageHelper;
import com.sj.demo.common.base.BaseController;
import com.sj.demo.common.domain.PageVo;
import com.sj.demo.domain.user.vo.SjSysUserSearchVo;
import com.sj.demo.service.user.SjSysUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/*
 * @Author: daixq
 * @Date: 2021/4/7 16:55
 * @Description:
 **/
@RestController
@RequestMapping("/api/user")
public class SjSysUserController extends BaseController {

    @Resource
    private SjSysUserService sjSysUserService;

    @PostMapping("/queryUser")
    public PageVo queryUser(SjSysUserSearchVo sjSysUser){
        PageHelper.startPage(sjSysUser.getPageNum(),sjSysUser.getPageSize());
        return getDataTable(sjSysUserService.queryUser(sjSysUser));
    }

}

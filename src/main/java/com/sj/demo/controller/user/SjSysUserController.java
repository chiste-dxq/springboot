package com.sj.demo.controller.user;

import com.github.pagehelper.PageHelper;
import com.sj.demo.common.base.BaseController;
import com.sj.demo.common.domain.PageVo;
import com.sj.demo.common.domain.ResultMap;
import com.sj.demo.common.utils.ResultUtils;
import com.sj.demo.domain.user.SjSysUser;
import com.sj.demo.domain.user.vo.SjSysUserSearchVo;
import com.sj.demo.service.user.SjSysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
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
@Api(value = "用户管理Controller", tags = {"用户接口"})
public class SjSysUserController extends BaseController {

    @Resource
    private SjSysUserService sjSysUserService;

    @PostMapping("/query")
    @ApiModelProperty("新增用户")
    public PageVo queryUser(SjSysUserSearchVo sjSysUser){
        PageHelper.startPage(sjSysUser.getPageNum(),sjSysUser.getPageSize());
        return getDataTable(sjSysUserService.queryUser(sjSysUser));
    }

    @PostMapping("/insert")
    @ApiModelProperty("新增用户")
    public ResultMap insert(SjSysUser sjSysUser){
        sjSysUserService.insert(sjSysUser);
        return ResultUtils.success();
    }

    @PostMapping("/update")
    @ApiModelProperty("更新用户")
    public ResultMap update(SjSysUser sjSysUser){
        sjSysUserService.update(sjSysUser);
        return ResultUtils.success();
    }

}

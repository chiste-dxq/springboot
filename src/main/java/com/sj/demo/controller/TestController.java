package com.sj.demo.controller;

import com.github.pagehelper.PageHelper;
import com.sj.demo.common.annotation.Log;
import com.sj.demo.common.base.BaseController;
import com.sj.demo.common.domain.JsonRequestBody;
import com.sj.demo.common.domain.PageVo;
import com.sj.demo.common.domain.ResultMap;
import com.sj.demo.common.enums.BusinessType;
import com.sj.demo.common.utils.ResultUtils;
import com.sj.demo.domain.log.vo.SjSysLogsListVO;
import com.sj.demo.domain.user.SjSysUser;
import com.sj.demo.service.log.SjSysLogsService;
import com.sj.demo.service.sys.TableService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/*
 * @Author: daixq
 * @Date: 2021/4/2 10:54
 * @Description:
 **/
@RequestMapping("/api/test")
@RestController
@Slf4j
public class TestController extends BaseController {

    @Resource
    private SjSysLogsService sjSysLogsService;

    @Resource
    private TableService tableService;

    @RequestMapping("/test")
    @Log( title="测试" ,businessType = BusinessType.INSERT)
    public ResultMap<String> test(@RequestBody(required = false) JsonRequestBody<Map<String, Object>> requestBody,
                                  HttpServletRequest request,
                                  HttpServletResponse response) throws Exception {
        String jsonString = null;
        SjSysUser usr = new SjSysUser();
        usr.setUserCode("123");
        usr.setUserName("张三");
        usr.setUserSex("男");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("usr", usr);
        return ResultUtils.success(usr);
    }

    @PostMapping("/query")
    @Log( title="测试分页" ,businessType = BusinessType.OTHER)
    public PageVo query(SjSysLogsListVO sysLogs) throws Exception {
        PageHelper.startPage(sysLogs.getPageNum(),sysLogs.getPageSize());
        return getDataTable(sjSysLogsService.querySjSysLogs(sysLogs));
    }
}

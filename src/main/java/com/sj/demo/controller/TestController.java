package com.sj.demo.controller;

import com.github.pagehelper.PageHelper;
import com.sj.demo.common.annotation.Log;
import com.sj.demo.common.base.BaseController;
import com.sj.demo.common.domain.PageVo;
import com.sj.demo.common.domain.ResultMap;
import com.sj.demo.common.enums.BusinessType;
import com.sj.demo.common.util.ResultUtils;
import com.sj.demo.domain.log.vo.SjSysLogsListVO;
import com.sj.demo.server.log.SjSysLogsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
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

    @PostMapping("/test")
    @Log( title="测试" ,businessType = BusinessType.INSERT)
    public ResultMap<String> test() throws Exception {
        return ResultUtils.success("测试成功");
    }

    @PostMapping("/query")
    @Log( title="测试分页" ,businessType = BusinessType.OTHER)
    public PageVo query(SjSysLogsListVO sysLogs) throws Exception {
        PageHelper.startPage(sysLogs.getPageNum(),sysLogs.getPageSize());
        return getDataTable(sjSysLogsService.querySjSysLogs(sysLogs));
    }

    public static void main(String[] args) {

    }
}

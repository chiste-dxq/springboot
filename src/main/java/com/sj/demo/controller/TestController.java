package com.sj.demo.controller;

import com.sj.demo.common.annotation.Log;
import com.sj.demo.common.domain.ResultMap;
import com.sj.demo.common.enums.BusinessType;
import com.sj.demo.common.util.ResultUtils;
import com.sj.demo.domain.SjSysLogs;
import com.sj.demo.server.log.SjSysLogsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/*
 * @Author: daixq
 * @Date: 2021/4/2 10:54
 * @Description:
 **/
@RequestMapping("/api/test")
@RestController
@Slf4j
public class TestController {

    @Resource
    private SjSysLogsService sjSysLogsService;

    @PostMapping("/test")
    @Log( title="测试" ,businessType = BusinessType.INSERT)
    public ResultMap<String> test() throws Exception {
        return ResultUtils.success("测试成功");
    }

    @PostMapping("/query")
    @Log( title="测试分页" ,businessType = BusinessType.OTHER)
    public ResultMap<List<SjSysLogs>> query( SjSysLogs sysLogs) throws Exception {
        return ResultUtils.success(sjSysLogsService.querySjSysLogs(sysLogs));
    }
}

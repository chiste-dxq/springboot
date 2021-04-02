package com.sj.demo.server.log.impl;

import com.sj.demo.domain.SjSysLogs;
import com.sj.demo.mapper.log.SjSysLogsMapper;
import com.sj.demo.server.log.SjSysLogsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
 * @Author: daixq
 * @Date: 2021/4/2 14:42
 * @Description:
 **/
@Service
public class SjSysLogsServiceImpl implements SjSysLogsService {

    @Resource
    private SjSysLogsMapper mapper;

    @Override
    public int insert(SjSysLogs sysLogs) {
        return mapper.insert(sysLogs);
    }

    @Override
    public List<SjSysLogs> querySjSysLogs(SjSysLogs logs) {
        return mapper.querySjSysLogs(logs);
    }
}

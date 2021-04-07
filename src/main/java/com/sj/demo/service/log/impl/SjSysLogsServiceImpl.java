package com.sj.demo.service.log.impl;

import com.sj.demo.domain.log.SjSysLogs;
import com.sj.demo.domain.log.vo.SjSysLogsListVO;
import com.sj.demo.mapper.sys.log.SjSysLogsMapper;
import com.sj.demo.service.log.SjSysLogsService;
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
    public List<SjSysLogs> querySjSysLogs(SjSysLogsListVO logs) {
        return mapper.querySjSysLogs(logs);
    }
}

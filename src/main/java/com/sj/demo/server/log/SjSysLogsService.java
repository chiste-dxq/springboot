package com.sj.demo.server.log;

import com.sj.demo.domain.log.SjSysLogs;

import java.util.List;

/*
 * @Author: daixq
 * @Date: 2021/4/2 14:41
 * @Description:
 **/
public interface SjSysLogsService {

    int insert(SjSysLogs sysLogs);

    List<SjSysLogs> querySjSysLogs(SjSysLogs logs);
}

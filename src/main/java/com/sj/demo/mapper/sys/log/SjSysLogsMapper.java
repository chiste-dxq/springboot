package com.sj.demo.mapper.sys.log;

import com.sj.demo.domain.log.SjSysLogs;
import com.sj.demo.domain.log.vo.SjSysLogsListVO;

import java.util.List;

/*
 * @Author: daixq
 * @Date: 2021/4/2 14:46
 * @Description:
 **/

public interface SjSysLogsMapper {

    int insert(SjSysLogs sysLogs);

    int update(SjSysLogs sysLogs);

    SjSysLogs getSjSysLogsById(Integer id);

    List<SjSysLogs> querySjSysLogs(SjSysLogsListVO logs);
}

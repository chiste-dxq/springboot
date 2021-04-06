package com.sj.demo.domain.log.vo;

import com.sj.demo.common.base.BaseVO;
import lombok.Data;

import java.util.Date;

/*
 * @Author: daixq
 * @Date: 2021/4/6 9:27
 * @Description:
 **/
@Data
public class SjSysLogsListVO extends BaseVO {
    private int id;
    private String level;
    private String className;
    private String logger;
    private String message;
    private String function;
    private int type;
    private Date createDate;
    private String ip;
}

package com.sj.demo.domain;

import lombok.Data;

import java.util.Date;

/*
 * @Author: daixq
 * @Date: 2021/4/2 14:09
 * @Description:
 **/
@Data
public class SjSysLogs {
    private int id;
    private String level;
    private String className;
    private String logger;
    private String message;
    private String function;
    private int type;
    private Date createDate;
}

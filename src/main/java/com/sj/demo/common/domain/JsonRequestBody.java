package com.sj.demo.common.domain;

import lombok.Data;

import java.util.Date;
import java.util.List;

/*
 * @Author: daixq
 * @Date: 2021/4/7 14:34
 * @Description:
 **/
@Data
public class JsonRequestBody<T> {

    private String requestNo;
    private Date responseTimestamp;
    private String type;
    private String userid;
    private String adminId;
    private String userType;
    private String token;
    private String useDates;
    private List<String> requestData;
}

package com.sj.demo.common.util;

import com.sj.demo.common.domain.ResultMap;

/*
 * @Author: daixq
 * @Date: 2021/4/2 16:51
 * @Description:
 **/
public class ResultUtils {

    private static Integer SUCCESS_CODE = 200;
    private static String DEFAULT_SUCCESS_MESSAGE = "请求成功";
    private static String DEFAULT_FAILED_MESSAGE = "请求失败";

    /**
     * 带参请求成功返回
     * @param object
     * @return
     */
    public static ResultMap success(Object object){
        ResultMap msg = new ResultMap();
        msg.setCode(SUCCESS_CODE);
        msg.setMsg(DEFAULT_SUCCESS_MESSAGE);
        msg.setData(object);
        return msg;
    }

    /**
     * 无参请求成功返回
     * @return
     */
    public static ResultMap success(){
        return success(null);
    }

    /**
     * 默认请求失败返回
     * @param code
     * @return
     */
    public static ResultMap error(Integer code){
        ResultMap msg=new ResultMap();
        msg.setCode(code);
        msg.setMsg(DEFAULT_FAILED_MESSAGE);
        return msg;
    }

    /**
     * 带参请求失败返回
     * @param code
     * @param failedMsg
     * @return
     */
    public static ResultMap error(Integer code,String failedMsg){
        ResultMap msg=new ResultMap();
        msg.setCode(code);
        msg.setMsg(failedMsg);
        return msg;
    }

}

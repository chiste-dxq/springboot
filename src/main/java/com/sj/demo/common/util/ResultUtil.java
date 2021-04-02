package com.sj.demo.common.util;

import com.sj.demo.common.domain.ResultMap;

/*
 * @Author: daixq
 * @Date: 2021/4/2 16:51
 * @Description:
 **/
public class ResultUtil {

    /**
     * 请求成功返回
     * @param object
     * @return
     */
    public static ResultMap success(Object object){
        ResultMap msg=new ResultMap();
        msg.setCode(200);
        msg.setMsg("请求成功");
        msg.setData(object);
        return msg;
    }
    public static ResultMap success(){
        return success(null);
    }

    public static ResultMap error(Integer code,String resultmsg){
        ResultMap msg=new ResultMap();
        msg.setCode(code);
        msg.setMsg(resultmsg);
        return msg;
    }

}

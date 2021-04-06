package com.sj.demo.common.base;

import com.github.pagehelper.PageInfo;
import com.sj.demo.common.domain.PageVo;
import com.sj.demo.common.util.ResultUtils;

import java.util.List;

/*
 * @Author: daixq
 * @Date: 2021/4/6 9:24
 * @Description:
 **/
public class BaseController {

    public static PageVo getDataTable(List<?> list)
    {
        PageVo rspData = new PageVo();
        rspData.setCode(200);
        rspData.setRows(list);
        rspData.setMsg(ResultUtils.DEFAULT_SUCCESS_MESSAGE);
        rspData.setTotal(new PageInfo(list).getTotal());
        return rspData;
    }
}

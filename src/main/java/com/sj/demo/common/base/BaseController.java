package com.sj.demo.common.base;

import com.github.pagehelper.PageInfo;
import com.sj.demo.common.domain.PageVo;
import com.sj.demo.common.util.DateUtils;
import com.sj.demo.common.util.ResultUtils;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.beans.PropertyEditorSupport;
import java.util.Date;
import java.util.List;

/*
 * @Author: daixq
 * @Date: 2021/4/6 9:24
 * @Description:
 **/
public class BaseController {

    /**
     * 将前台传递过来的日期格式的字符串，自动转化为Date类型
     */
    @InitBinder
    public void initBinder(WebDataBinder binder)
    {
        // Date 类型转换
        binder.registerCustomEditor(Date.class, new PropertyEditorSupport()
        {
            @Override
            public void setAsText(String text)
            {
                setValue(DateUtils.parseDate(text));
            }
        });
    }

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

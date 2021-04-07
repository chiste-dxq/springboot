package com.sj.demo.common.base;

import com.github.pagehelper.PageInfo;
import com.sj.demo.common.domain.PageVo;
import com.sj.demo.common.util.DateUtils;
import com.sj.demo.common.util.ResultUtils;
import org.apache.commons.lang3.StringUtils;
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
public class BaseController<T> {

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

    public static PageVo getDataTable(List<?> list) {
        PageVo rspData = new PageVo();
        rspData.setCode(200);
        rspData.setRows(list);
        rspData.setMsg(ResultUtils.DEFAULT_SUCCESS_MESSAGE);
        rspData.setTotal(new PageInfo(list).getTotal());
        return rspData;
    }

    public List<?> chargeList(List<?> list){
        for(Object vo : list){

        }
        return null;
    }


    public static String convertByExp(String propertyValue, String converterExp, String separator)
    {
        StringBuilder propertyString = new StringBuilder();
        String[] convertSource = converterExp.split(",");
        for (String item : convertSource)
        {
            String[] itemArray = item.split("=");
            if (StringUtils.containsAny(separator, propertyValue))
            {
                for (String value : propertyValue.split(separator))
                {
                    if (itemArray[0].equals(value))
                    {
                        propertyString.append(itemArray[1] + separator);
                        break;
                    }
                }
            }
            else
            {
                if (itemArray[0].equals(propertyValue))
                {
                    return itemArray[1];
                }
            }
        }
        return StringUtils.stripEnd(propertyString.toString(), separator);
    }
}

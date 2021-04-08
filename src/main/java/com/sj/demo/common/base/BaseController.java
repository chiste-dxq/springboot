package com.sj.demo.common.base;

import com.github.pagehelper.PageInfo;
import com.sj.demo.common.annotation.AnalysisField;
import com.sj.demo.common.domain.PageVo;
import com.sj.demo.common.utils.DataUtils;
import com.sj.demo.common.utils.DateUtils;
import com.sj.demo.common.utils.ResultUtils;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.beans.PropertyEditorSupport;
import java.lang.reflect.Field;
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
    public void initBinder(WebDataBinder binder) {
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

    /**
     * 获取表格分页数据
     * @param list
     * @return
     */
    public static PageVo getDataTable(List<?> list) {
        PageVo rspData = new PageVo();
        rspData.setCode(200);
        rspData.setRows(chargeList(list));
        rspData.setMsg(ResultUtils.DEFAULT_SUCCESS_MESSAGE);
        rspData.setTotal(new PageInfo(list).getTotal());
        return rspData;
    }

    /**
     * 转义list
     * @param list
     * @return
     */
    public static List<?> chargeList(List<?> list){
        Field[] fields = list.get(0).getClass().getDeclaredFields();
        for(Object obj : list){
            for(int i=0;i<fields.length;i++){
                Field field = fields[i];
                AnalysisField analysisField = field.getAnnotation(AnalysisField.class);
                if(analysisField != null){
                    try {
                        Object value = DataUtils.getValue(obj, field.getName());
                        String newValue = DataUtils.convertByExp(value.toString(),analysisField.dictType(),";");
                        DataUtils.setValue(obj,field.getName(),newValue);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return list;
    }
}

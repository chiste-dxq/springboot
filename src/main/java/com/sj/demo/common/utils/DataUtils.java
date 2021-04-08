package com.sj.demo.common.utils;

import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Field;

/*
 * @Author: daixq
 * @Date: 2021/4/8 9:44
 * @Description:
 **/
public class DataUtils {

    /**
     * 获取字段值
     * @param o 实体对象
     * @param name 字段名称
     * @return
     * @throws Exception
     */
    public static Object getValue(Object o, String name) throws Exception {
        if (o!=null && StringUtils.isNotEmpty(name)) {
            Class<?> clazz = o.getClass();
            Field field = clazz.getDeclaredField(name);
            field.setAccessible(true);
            o = field.get(o);
        }
        return o;
    }

    /**
     * 设置字段值
     * @param o 实体对象
     * @param name 字段名称
     * @param value 值
     * @throws Exception
     */
    public static void setValue(Object o, String name, String value) throws Exception {
        if (o!=null && StringUtils.isNotEmpty(name)) {
            Class<?> clazz = o.getClass();
            Field field = clazz.getDeclaredField(name);
            field.setAccessible(true);
            field.set(o,value);
        }
    }

    /**
     * 拆解分析词并导出解析后的值
     * @param propertyValue 分析的值
     * @param converterExp 对照串
     * @param separator 分隔符
     * @return
     */
    public static String convertByExp(String propertyValue, String converterExp, String separator) {
        StringBuilder propertyString = new StringBuilder();
        String[] convertSource = converterExp.split(separator);
        for (String item : convertSource) {
            String[] itemArray = item.split(":");
            if (StringUtils.containsAny(separator, propertyValue)) {
                for (String value : propertyValue.split(separator)) {
                    if (itemArray[0].equals(value)) {
                        propertyString.append(itemArray[1] + separator);
                        break;
                    }
                }
            }
            else {
                if (itemArray[0].equals(propertyValue)) {
                    return itemArray[1];
                }
            }
        }
        return StringUtils.stripEnd(propertyString.toString(), separator);
    }
}

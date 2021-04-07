package com.sj.demo.common.annotation;

import java.lang.annotation.*;

/*
 * @Author: daixq
 * @Date: 2021/4/7 17:17
 * @Description:
 **/
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AnalysisField {

    public String name() default "";
    public String dictType() default "";
}

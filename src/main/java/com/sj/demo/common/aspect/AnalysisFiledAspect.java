package com.sj.demo.common.aspect;

import com.sj.demo.common.annotation.AnalysisField;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/*
 * @Author: daixq
 * @Date: 2021/4/7 17:19
 * @Description:
 **/
@Aspect
@Component
public class AnalysisFiledAspect extends BaseAspect{

    private static final Logger log = LoggerFactory.getLogger(LogAspect.class);

    // 配置织入点
    @Pointcut("@annotation(com.sj.demo.common.annotation.AnalysisField)")
    public void pointCut() { }

    @After("pointCut()")
    public void doBefore(JoinPoint joinPoint){
        try {
            AnalysisField field = (AnalysisField) getAnnotationLog(joinPoint,AnalysisField.class);
            String str = field.dictType();
            System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

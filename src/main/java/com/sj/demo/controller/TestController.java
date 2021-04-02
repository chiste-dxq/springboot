package com.sj.demo.controller;

/*
 * @Author: daixq
 * @Date: 2021/4/2 10:54
 * @Description:
 **/

import com.sj.demo.common.annotation.Log;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/test")
@RestController
@Slf4j
public class TestController {

    public static Logger logger = LoggerFactory.getLogger(TestController.class);

    @PostMapping("/test")
    @Log( title="测试")
    public void test() throws Exception {
        throw new Exception("test");
    }
}

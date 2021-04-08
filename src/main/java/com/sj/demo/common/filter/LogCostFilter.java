package com.sj.demo.common.filter;

import javax.servlet.*;
import java.io.IOException;

/*
 * @Author: daixq
 * @Date: 2021/4/7 10:20
 * @Description:
 **/
//@WebFilter(urlPatterns = "/*", filterName = "LogCostFilter")// 直接注解方式
public class LogCostFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}

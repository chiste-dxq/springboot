package com.sj.demo.common.domain;

import lombok.Data;

import java.util.List;

/*
 * @Author: daixq
 * @Date: 2021/4/6 9:17
 * @Description:
 **/
@Data
public class PageVo {

    private static final long serialVersionUID = 1L;

    /** 总记录数 */
    private long total;

    /** 列表数据 */
    private List<?> rows;

    /** 消息状态码 */
    private int code;

    /** 消息内容 */
    private String msg;

    /**
     * 表格数据对象
     */
    public PageVo() {
    }

    /**
     * 分页
     *
     * @param list 列表数据
     * @param total 总记录数
     */
    public PageVo(List<?> list, int total) {
        this.rows = list;
        this.total = total;
    }
}

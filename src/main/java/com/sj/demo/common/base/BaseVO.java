package com.sj.demo.common.base;

import lombok.Data;

/*
 * @Author: daixq
 * @Date: 2021/4/6 9:29
 * @Description:
 **/
@Data
public class BaseVO {
    /** 当前记录起始索引 */
    private Integer pageNum;

    /** 每页显示记录数 */
    private Integer pageSize;

    /** 排序列 */
    private String orderByColumn;
}

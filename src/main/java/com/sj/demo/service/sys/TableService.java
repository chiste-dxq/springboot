package com.sj.demo.service.sys;

import com.sj.demo.common.domain.TableVo;

import java.util.List;

/*
 * @Author: daixq
 * @Date: 2021/4/8 11:22
 * @Description:
 **/
public interface TableService {

    List<TableVo> queryTable(String prefix);
}

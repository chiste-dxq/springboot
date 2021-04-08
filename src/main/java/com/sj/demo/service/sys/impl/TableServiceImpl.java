package com.sj.demo.service.sys.impl;

import com.sj.demo.common.domain.TableVo;
import com.sj.demo.mapper.work.TableMapper;
import com.sj.demo.service.sys.TableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
 * @Author: daixq
 * @Date: 2021/4/8 11:23
 * @Description:
 **/
@Service
public class TableServiceImpl implements TableService {

    @Resource
    private TableMapper tableMapper;

    @Override
    public List<TableVo> queryTable(String prefix) {
        return tableMapper.queryTable(prefix);
    }
}

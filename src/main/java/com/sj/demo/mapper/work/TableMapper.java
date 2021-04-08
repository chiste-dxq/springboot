package com.sj.demo.mapper.work;

import com.sj.demo.common.domain.TableVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*
 * @Author: daixq
 * @Date: 2021/4/8 11:16
 * @Description:
 **/
public interface TableMapper {

    List<TableVo> queryTable(@Param("prefix") String prefix);

}

package com.sj.demo.domain.user.vo;

import com.sj.demo.common.base.BaseVO;
import lombok.Data;

/*
 * @Author: daixq
 * @Date: 2021/4/7 16:57
 * @Description:
 **/
@Data
public class SjSysUserSearchVo extends BaseVO {

    private String userCode;

    private String userName;

    private String userSex;
}

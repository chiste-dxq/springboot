package com.sj.demo.domain.user;

import com.sj.demo.common.annotation.AnalysisField;
import lombok.Data;

import javax.persistence.*;

@Table(name = "`sj_sys_user`")
@Data
public class SjSysUser {
    @Id
    @Column(name = "`id`")
    private Integer id;

    @Column(name = "`user_code`")
    private String userCode;

    @Column(name = "`user_name`")
    private String userName;

    @Column(name = "`user_sex`")
    @AnalysisField(name="userSex", dictType = "0:女;1:男")
    private String userSex;

    @Column(name = "`password`")
    private String password;

    @Column(name = "`salt`")
    private String salt;
}
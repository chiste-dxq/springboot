package com.sj.demo.domain.work;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`sj_work_main`")
public class SjWorkMain implements Serializable {
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 工作流名称
     */
    @Column(name = "`work_name`")
    private String workName;

    /**
     * 工作流编码
     */
    @Column(name = "`work_code`")
    private String workCode;

    /**
     * 创建用户
     */
    @Column(name = "`create_user`")
    private Integer createUser;

    /**
     * 创建时间
     */
    @Column(name = "`create_time`")
    private Date createTime;

    /**
     * 创建用户名称
     */
    @Column(name = "`create_user_name`")
    private String createUserName;

    /**
     * 更新用户
     */
    @Column(name = "`update_user`")
    private Integer updateUser;

    /**
     * 更新时间
     */
    @Column(name = "`update_time`")
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取工作流名称
     *
     * @return work_name - 工作流名称
     */
    public String getWorkName() {
        return workName;
    }

    /**
     * 设置工作流名称
     *
     * @param workName 工作流名称
     */
    public void setWorkName(String workName) {
        this.workName = workName == null ? null : workName.trim();
    }

    /**
     * 获取工作流编码
     *
     * @return work_code - 工作流编码
     */
    public String getWorkCode() {
        return workCode;
    }

    /**
     * 设置工作流编码
     *
     * @param workCode 工作流编码
     */
    public void setWorkCode(String workCode) {
        this.workCode = workCode == null ? null : workCode.trim();
    }

    /**
     * 获取创建用户
     *
     * @return create_user - 创建用户
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建用户
     *
     * @param createUser 创建用户
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取创建用户名称
     *
     * @return create_user_name - 创建用户名称
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**
     * 设置创建用户名称
     *
     * @param createUserName 创建用户名称
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    /**
     * 获取更新用户
     *
     * @return update_user - 更新用户
     */
    public Integer getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置更新用户
     *
     * @param updateUser 更新用户
     */
    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
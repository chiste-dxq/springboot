package com.sj.demo.domain.role;

import javax.persistence.*;

@Table(name = "`sj_sys_role`")
public class SjSysRole {
    @Id
    @Column(name = "`id`")
    private Integer id;

    @Column(name = "`role_code`")
    private String roleCode;

    @Column(name = "`role_name`")
    private String roleName;

    @Column(name = "`role_group_id`")
    private Integer roleGroupId;

    @Column(name = "`role_sort`")
    private Integer roleSort;

    @Column(name = "`is_delete`")
    private Boolean delete;

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
     * @return role_code
     */
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * @param roleCode
     */
    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    /**
     * @return role_name
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * @return role_group_id
     */
    public Integer getRoleGroupId() {
        return roleGroupId;
    }

    /**
     * @param roleGroupId
     */
    public void setRoleGroupId(Integer roleGroupId) {
        this.roleGroupId = roleGroupId;
    }

    /**
     * @return role_sort
     */
    public Integer getRoleSort() {
        return roleSort;
    }

    /**
     * @param roleSort
     */
    public void setRoleSort(Integer roleSort) {
        this.roleSort = roleSort;
    }

    /**
     * @return is_delete
     */
    public Boolean getDelete() {
        return delete;
    }

    /**
     * @param delete
     */
    public void setDelete(Boolean delete) {
        this.delete = delete;
    }
}
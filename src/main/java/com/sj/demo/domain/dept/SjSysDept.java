package com.sj.demo.domain.dept;

import javax.persistence.*;

@Table(name = "`sj_sys_dept`")
public class SjSysDept {
    @Id
    @Column(name = "`id`")
    private Integer id;

    @Column(name = "`dept_code`")
    private String deptCode;

    @Column(name = "`dept_name`")
    private String deptName;

    @Column(name = "`parent_id`")
    private Integer parentId;

    @Column(name = "`childrens`")
    private String childrens;

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
     * @return dept_code
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * @param deptCode
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    /**
     * @return dept_name
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * @param deptName
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * @return parent_id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * @return childrens
     */
    public String getChildrens() {
        return childrens;
    }

    /**
     * @param childrens
     */
    public void setChildrens(String childrens) {
        this.childrens = childrens == null ? null : childrens.trim();
    }
}
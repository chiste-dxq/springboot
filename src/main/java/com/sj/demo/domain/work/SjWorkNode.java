package com.sj.demo.domain.work;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "`sj_work_node`")
public class SjWorkNode implements Serializable {
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 节点编码
     */
    @Column(name = "`node_code`")
    private String nodeCode;

    /**
     * 节点名称
     */
    @Column(name = "`node_name`")
    private String nodeName;

    /**
     * 工作流表主键
     */
    @Column(name = "`work_main_id`")
    private Integer workMainId;

    /**
     * 节点类型
     */
    @Column(name = "`node_type`")
    private String nodeType;

    /**
     * 节点顺序
     */
    @Column(name = "`node_sort`")
    private Integer nodeSort;

    /**
     * 逻辑删除标志位
     */
    @Column(name = "`is_delete`")
    private Boolean delete;

    /**
     * 返回节点id
     */
    @Column(name = "`return_node_id`")
    private Integer returnNodeId;

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
     * 获取节点编码
     *
     * @return node_code - 节点编码
     */
    public String getNodeCode() {
        return nodeCode;
    }

    /**
     * 设置节点编码
     *
     * @param nodeCode 节点编码
     */
    public void setNodeCode(String nodeCode) {
        this.nodeCode = nodeCode == null ? null : nodeCode.trim();
    }

    /**
     * 获取节点名称
     *
     * @return node_name - 节点名称
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * 设置节点名称
     *
     * @param nodeName 节点名称
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName == null ? null : nodeName.trim();
    }

    /**
     * 获取工作流表主键
     *
     * @return work_main_id - 工作流表主键
     */
    public Integer getWorkMainId() {
        return workMainId;
    }

    /**
     * 设置工作流表主键
     *
     * @param workMainId 工作流表主键
     */
    public void setWorkMainId(Integer workMainId) {
        this.workMainId = workMainId;
    }

    /**
     * 获取节点类型
     *
     * @return node_type - 节点类型
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * 设置节点类型
     *
     * @param nodeType 节点类型
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType == null ? null : nodeType.trim();
    }

    /**
     * 获取节点顺序
     *
     * @return node_sort - 节点顺序
     */
    public Integer getNodeSort() {
        return nodeSort;
    }

    /**
     * 设置节点顺序
     *
     * @param nodeSort 节点顺序
     */
    public void setNodeSort(Integer nodeSort) {
        this.nodeSort = nodeSort;
    }

    /**
     * 获取逻辑删除标志位
     *
     * @return is_delete - 逻辑删除标志位
     */
    public Boolean getDelete() {
        return delete;
    }

    /**
     * 设置逻辑删除标志位
     *
     * @param delete 逻辑删除标志位
     */
    public void setDelete(Boolean delete) {
        this.delete = delete;
    }

    /**
     * 获取返回节点id
     *
     * @return return_node_id - 返回节点id
     */
    public Integer getReturnNodeId() {
        return returnNodeId;
    }

    /**
     * 设置返回节点id
     *
     * @param returnNodeId 返回节点id
     */
    public void setReturnNodeId(Integer returnNodeId) {
        this.returnNodeId = returnNodeId;
    }
}
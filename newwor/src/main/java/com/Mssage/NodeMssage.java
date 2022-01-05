package com.Mssage;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel("节点详情字段")
public class NodeMssage {

    @ApiModelProperty("节点ID")
    private String id;

    @ApiModelProperty("节点级别（督办节点无级别）")
    private String node_level;

    @ApiModelProperty("节点名字")
    private String node_name;

    @ApiModelProperty("处理状态（0：未审批 1：已审批 2：退回）")
    private String node_type;

    @ApiModelProperty("截止事件")
    private String node_endtime;

    @ApiModelProperty("工单关联id")
    private String sheet_id;

    @ApiModelProperty("事件关联id")
    private String event_id;

    @ApiModelProperty("办理单位标识（0：督办 1：普通节点）")
    private String node_depttype;

    @ApiModelProperty("任务内容")
    private String node_mssage;

    @ApiModelProperty("节点编号")
    private String node_nameno;
    @ApiModelProperty("督办节点审批次数")
    private String node_db;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNode_level() {
        return node_level;
    }

    public void setNode_level(String node_level) {
        this.node_level = node_level;
    }

    public String getNode_name() {
        return node_name;
    }

    public void setNode_name(String node_name) {
        this.node_name = node_name;
    }

    public String getNode_type() {
        return node_type;
    }

    public void setNode_type(String node_type) {
        this.node_type = node_type;
    }

    public String getNode_endtime() {
        return node_endtime;
    }

    public void setNode_endtime(String node_endtime) {
        this.node_endtime = node_endtime;
    }

    public String getSheet_id() {
        return sheet_id;
    }

    public void setSheet_id(String sheet_id) {
        this.sheet_id = sheet_id;
    }

    public String getEvent_id() {
        return event_id;
    }

    public void setEvent_id(String event_id) {
        this.event_id = event_id;
    }

    public String getNode_depttype() {
        return node_depttype;
    }

    public void setNode_depttype(String node_depttype) {
        this.node_depttype = node_depttype;
    }

    public String getNode_mssage() {
        return node_mssage;
    }

    public void setNode_mssage(String node_mssage) {
        this.node_mssage = node_mssage;
    }

    public String getNode_nameno() {
        return node_nameno;
    }

    public void setNode_nameno(String node_nameno) {
        this.node_nameno = node_nameno;
    }

    public String getNode_db() {
        return node_db;
    }

    public void setNode_db(String node_db) {
        this.node_db = node_db;
    }
}

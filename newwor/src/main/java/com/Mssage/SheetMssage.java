package com.Mssage;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel("工单详情字段")
public class SheetMssage<T> {
    @ApiModelProperty("分页起始页")
    private int page;//分页起始页
    @ApiModelProperty("分页起始页")
    private int size;//每页记录数
    @ApiModelProperty("返回的记录集合")
    private List<T> rows;//返回的记录集合
    @ApiModelProperty("总记录条数")
    private long total;//总记录条数

    @ApiModelProperty("工单ID")
    private String id;

    @ApiModelProperty("内容")
    private String sheet_mssage;

    @ApiModelProperty("地址")
    private String sheet_addr;

    @ApiModelProperty("等级")
    private String sheet_level;

    @ApiModelProperty("创建用户")
    private String sheet_customer;

    @ApiModelProperty("下单时间")
    private String sheet_starttime;

    @ApiModelProperty("状态")
    private String sheet_type;

    @ApiModelProperty("操作")
    private String sheet_operation;

    @ApiModelProperty("处理状态（1：待处理 2：已完成  3：超时）")
    private String sheet_cltype;

    @ApiModelProperty("与事件id关联")
    private String event_id;

    @ApiModelProperty("事件小类")
    private String sheet_subclass;

    @ApiModelProperty("发生时间")
    private String sheet_fstime;

    @ApiModelProperty("信息来源")
    private String sheet_source;

    @ApiModelProperty("上报人")
    private String sheet_reportname;

    @ApiModelProperty("联系人")
    private String sheet_contactsname;

    @ApiModelProperty("联系电话")
    private String sheet_contactsphone;

    @ApiModelProperty("社区")
    private String sheet_community;

    @ApiModelProperty("详细地址")
    private String sheet_addrmssage;

    @ApiModelProperty("事件详情")
    private String sheet_eventmssage;

    @ApiModelProperty("录入人姓名")
    private String sheet_inputname;

    @ApiModelProperty("录入人联系电话")
    private String sheet_inputphone;

    @ApiModelProperty("工单号")
    private String sheet_no;

    @ApiModelProperty("备注")
    private String sheet_bz;

    @ApiModelProperty("登陆账号")
    private String user_no;

    @ApiModelProperty("当前节点")
    private String dqjd;
    @ApiModelProperty("事件来源")
    private String sheet_ly;
    @ApiModelProperty("事件来源编号")
    private String sheet_lyno;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSheet_mssage() {
        return sheet_mssage;
    }

    public void setSheet_mssage(String sheet_mssage) {
        this.sheet_mssage = sheet_mssage;
    }

    public String getSheet_addr() {
        return sheet_addr;
    }

    public void setSheet_addr(String sheet_addr) {
        this.sheet_addr = sheet_addr;
    }

    public String getSheet_level() {
        return sheet_level;
    }

    public void setSheet_level(String sheet_level) {
        this.sheet_level = sheet_level;
    }

    public String getSheet_customer() {
        return sheet_customer;
    }

    public void setSheet_customer(String sheet_customer) {
        this.sheet_customer = sheet_customer;
    }

    public String getSheet_starttime() {
        return sheet_starttime;
    }

    public void setSheet_starttime(String sheet_starttime) {
        this.sheet_starttime = sheet_starttime;
    }

    public String getSheet_type() {
        return sheet_type;
    }

    public void setSheet_type(String sheet_type) {
        this.sheet_type = sheet_type;
    }

    public String getSheet_operation() {
        return sheet_operation;
    }

    public void setSheet_operation(String sheet_operation) {
        this.sheet_operation = sheet_operation;
    }

    public String getSheet_cltype() {
        return sheet_cltype;
    }

    public void setSheet_cltype(String sheet_cltype) {
        this.sheet_cltype = sheet_cltype;
    }

    public String getEvent_id() {
        return event_id;
    }

    public void setEvent_id(String event_id) {
        this.event_id = event_id;
    }

    public String getSheet_subclass() {
        return sheet_subclass;
    }

    public void setSheet_subclass(String sheet_subclass) {
        this.sheet_subclass = sheet_subclass;
    }

    public String getSheet_fstime() {
        return sheet_fstime;
    }

    public void setSheet_fstime(String sheet_fstime) {
        this.sheet_fstime = sheet_fstime;
    }

    public String getSheet_source() {
        return sheet_source;
    }

    public void setSheet_source(String sheet_source) {
        this.sheet_source = sheet_source;
    }

    public String getSheet_reportname() {
        return sheet_reportname;
    }

    public void setSheet_reportname(String sheet_reportname) {
        this.sheet_reportname = sheet_reportname;
    }

    public String getSheet_contactsname() {
        return sheet_contactsname;
    }

    public void setSheet_contactsname(String sheet_contactsname) {
        this.sheet_contactsname = sheet_contactsname;
    }

    public String getSheet_contactsphone() {
        return sheet_contactsphone;
    }

    public void setSheet_contactsphone(String sheet_contactsphone) {
        this.sheet_contactsphone = sheet_contactsphone;
    }

    public String getSheet_community() {
        return sheet_community;
    }

    public void setSheet_community(String sheet_community) {
        this.sheet_community = sheet_community;
    }

    public String getSheet_addrmssage() {
        return sheet_addrmssage;
    }

    public void setSheet_addrmssage(String sheet_addrmssage) {
        this.sheet_addrmssage = sheet_addrmssage;
    }

    public String getSheet_eventmssage() {
        return sheet_eventmssage;
    }

    public void setSheet_eventmssage(String sheet_eventmssage) {
        this.sheet_eventmssage = sheet_eventmssage;
    }

    public String getSheet_inputname() {
        return sheet_inputname;
    }

    public void setSheet_inputname(String sheet_inputname) {
        this.sheet_inputname = sheet_inputname;
    }

    public String getSheet_inputphone() {
        return sheet_inputphone;
    }

    public void setSheet_inputphone(String sheet_inputphone) {
        this.sheet_inputphone = sheet_inputphone;
    }

    public String getSheet_no() {
        return sheet_no;
    }

    public void setSheet_no(String sheet_no) {
        this.sheet_no = sheet_no;
    }

    public String getSheet_bz() {
        return sheet_bz;
    }

    public void setSheet_bz(String sheet_bz) {
        this.sheet_bz = sheet_bz;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public String getUser_no() {
        return user_no;
    }

    public void setUser_no(String user_no) {
        this.user_no = user_no;
    }

    public String getDqjd() {
        return dqjd;
    }

    public void setDqjd(String dqjd) {
        this.dqjd = dqjd;
    }

    public String getSheet_ly() {
        return sheet_ly;
    }

    public void setSheet_ly(String sheet_ly) {
        this.sheet_ly = sheet_ly;
    }

    public String getSheet_lyno() {
        return sheet_lyno;
    }

    public void setSheet_lyno(String sheet_lyno) {
        this.sheet_lyno = sheet_lyno;
    }


}

package com.Mssage;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("部门详情字段")
public class DeptMssage {

    @ApiModelProperty("部门ID")
    private String id;

    @ApiModelProperty("部门2级编号")
    private String dept_no;

    @ApiModelProperty("部门2级名字")
    private String dept_name;

    @ApiModelProperty("部门1级名字")
    private String dept_onename;

    @ApiModelProperty("部门1级编号")
    private String dept_oneno;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDept_no() {
        return dept_no;
    }

    public void setDept_no(String dept_no) {
        this.dept_no = dept_no;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getDept_onename() {
        return dept_onename;
    }

    public void setDept_onename(String dept_onename) {
        this.dept_onename = dept_onename;
    }

    public String getDept_oneno() {
        return dept_oneno;
    }

    public void setDept_oneno(String dept_oneno) {
        this.dept_oneno = dept_oneno;
    }
}

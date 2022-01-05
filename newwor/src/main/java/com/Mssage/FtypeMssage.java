package com.Mssage;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("5级事件类型")
public class FtypeMssage {

    @ApiModelProperty("事件ID")
    private String id;

    @ApiModelProperty("本级类型编号")
    private String ftype_no;

    @ApiModelProperty("本级类型名称")
    private String ftype_name;

    @ApiModelProperty("五级类型编号")
    private String ftype_fiveno;

    @ApiModelProperty("五级类型名称")
    private String ftype_fivename;

    @ApiModelProperty("四级类型编号")
    private String ftype_fourno;

    @ApiModelProperty("四级类型名称")
    private String ftype_fourname;

    @ApiModelProperty("三级类型编号")
    private String ftype_threeno;

    @ApiModelProperty("三级类型名称")
    private String ftype_threename;

    @ApiModelProperty("二级类型编号")
    private String ftype_twono;

    @ApiModelProperty("二级类型名称")
    private String ftype_twoname;

    @ApiModelProperty("一级类型编号")
    private String ftype_oneno;

    @ApiModelProperty("一级类型名称")
    private String ftype_onename;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFtype_no() {
        return ftype_no;
    }

    public void setFtype_no(String ftype_no) {
        this.ftype_no = ftype_no;
    }

    public String getFtype_name() {
        return ftype_name;
    }

    public void setFtype_name(String ftype_name) {
        this.ftype_name = ftype_name;
    }

    public String getFtype_fiveno() {
        return ftype_fiveno;
    }

    public void setFtype_fiveno(String ftype_fiveno) {
        this.ftype_fiveno = ftype_fiveno;
    }

    public String getFtype_fivename() {
        return ftype_fivename;
    }

    public void setFtype_fivename(String ftype_fivename) {
        this.ftype_fivename = ftype_fivename;
    }

    public String getFtype_fourno() {
        return ftype_fourno;
    }

    public void setFtype_fourno(String ftype_fourno) {
        this.ftype_fourno = ftype_fourno;
    }

    public String getFtype_fourname() {
        return ftype_fourname;
    }

    public void setFtype_fourname(String ftype_fourname) {
        this.ftype_fourname = ftype_fourname;
    }

    public String getFtype_threeno() {
        return ftype_threeno;
    }

    public void setFtype_threeno(String ftype_threeno) {
        this.ftype_threeno = ftype_threeno;
    }

    public String getFtype_threename() {
        return ftype_threename;
    }

    public void setFtype_threename(String ftype_threename) {
        this.ftype_threename = ftype_threename;
    }

    public String getFtype_twono() {
        return ftype_twono;
    }

    public void setFtype_twono(String ftype_twono) {
        this.ftype_twono = ftype_twono;
    }

    public String getFtype_twoname() {
        return ftype_twoname;
    }

    public void setFtype_twoname(String ftype_twoname) {
        this.ftype_twoname = ftype_twoname;
    }

    public String getFtype_oneno() {
        return ftype_oneno;
    }

    public void setFtype_oneno(String ftype_oneno) {
        this.ftype_oneno = ftype_oneno;
    }

    public String getFtype_onename() {
        return ftype_onename;
    }

    public void setFtype_onename(String ftype_onename) {
        this.ftype_onename = ftype_onename;
    }
}

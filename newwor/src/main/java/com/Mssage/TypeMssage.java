package com.Mssage;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("3级事件类型")
public class TypeMssage {
    @ApiModelProperty("事件ID")
    private String id;

    @ApiModelProperty("本级类型编号")
    private String type_no;

    @ApiModelProperty("本级类型名称")
    private String type_name;

    @ApiModelProperty("三级类型编号")
    private String type_threeno;

    @ApiModelProperty("三级类型名称")
    private String type_threename;

    @ApiModelProperty("二级类型编号")
    private String type_twono;

    @ApiModelProperty("二级类型名称")
    private String type_twoname;

    @ApiModelProperty("一级类型编号")
    private String type_oneno;

    @ApiModelProperty("一级类型名称")
    private String fype_onename;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType_no() {
        return type_no;
    }

    public void setType_no(String type_no) {
        this.type_no = type_no;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public String getType_threeno() {
        return type_threeno;
    }

    public void setType_threeno(String type_threeno) {
        this.type_threeno = type_threeno;
    }

    public String getType_threename() {
        return type_threename;
    }

    public void setType_threename(String type_threename) {
        this.type_threename = type_threename;
    }

    public String getType_twono() {
        return type_twono;
    }

    public void setType_twono(String type_twono) {
        this.type_twono = type_twono;
    }

    public String getType_twoname() {
        return type_twoname;
    }

    public void setType_twoname(String type_twoname) {
        this.type_twoname = type_twoname;
    }

    public String getType_oneno() {
        return type_oneno;
    }

    public void setType_oneno(String type_oneno) {
        this.type_oneno = type_oneno;
    }

    public String getFype_onename() {
        return fype_onename;
    }

    public void setFype_onename(String fype_onename) {
        this.fype_onename = fype_onename;
    }
}

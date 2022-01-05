package com.Mssage;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("数据字典")
public class DateMssage {

    @ApiModelProperty("类型小类编号")
    private String ms_xlno;

    @ApiModelProperty("类型小类名字")
    private String ms_xlname;


    @ApiModelProperty("数据字典ID")
    private String id;

    @ApiModelProperty("事件主类")
    private String ms_zl;

    public String getMs_xlno() {
        return ms_xlno;
    }

    public void setMs_xlno(String ms_xlno) {
        this.ms_xlno = ms_xlno;
    }

    public String getMs_xlname() {
        return ms_xlname;
    }

    public void setMs_xlname(String ms_xlname) {
        this.ms_xlname = ms_xlname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMs_zl() {
        return ms_zl;
    }

    public void setMs_zl(String ms_zl) {
        this.ms_zl = ms_zl;
    }
}

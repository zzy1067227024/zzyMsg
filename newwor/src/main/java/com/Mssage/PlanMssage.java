package com.Mssage;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel("用户")
public class PlanMssage<T> {
    @ApiModelProperty("分页起始页")
    private int page;//分页起始页
    @ApiModelProperty("分页起始页")
    private int size;//每页记录数
    @ApiModelProperty("返回的记录集合")
    private List<T> rows;//返回的记录集合
    @ApiModelProperty("总记录条数")
    private long total;//总记录条数


        @ApiModelProperty("用户名字")
        private String plan_name;

    public String getPlan_name() {
        return plan_name;
    }

    public void setPlan_name(String plan_name) {
        this.plan_name = plan_name;
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
}


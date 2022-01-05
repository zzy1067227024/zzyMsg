package com.Mssage;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel("用户详情字段")
public class UserMssage<T> {

        @ApiModelProperty("分页起始页")
        private int page;//分页起始页
        @ApiModelProperty("分页起始页")
        private int size;//每页记录数
        @ApiModelProperty("返回的记录集合")
        private List<T> rows;//返回的记录集合
        @ApiModelProperty("总记录条数")
        private long total;//总记录条数

        @ApiModelProperty("用户名字")
        private String user_name;
        @ApiModelProperty("用户账号")
        private String user_no;
        @ApiModelProperty("用户密码")
        private String user_pw;
        @ApiModelProperty("部门编号")
        private String dept_no;
        @ApiModelProperty("部门名字")
        private String dept_name;
        @ApiModelProperty("角色名字")
        private String user_rolename;
        @ApiModelProperty("角色编号")
        private String user_roleno;
        @ApiModelProperty("用户ID")
        private String id;

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

        public String getUser_name() {
                return user_name;
        }

        public void setUser_name(String user_name) {
                this.user_name = user_name;
        }

        public String getUser_no() {
                return user_no;
        }

        public void setUser_no(String user_no) {
                this.user_no = user_no;
        }

        public String getUser_pw() {
                return user_pw;
        }

        public void setUser_pw(String user_pw) {
                this.user_pw = user_pw;
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

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public String getUser_rolename() {
                return user_rolename;
        }

        public void setUser_rolename(String user_rolename) {
                this.user_rolename = user_rolename;
        }

        public String getUser_roleno() {
                return user_roleno;
        }

        public void setUser_roleno(String user_roleno) {
                this.user_roleno = user_roleno;
        }
}


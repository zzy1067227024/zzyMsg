package com.Mssage;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel("事件详情字段")
public class EventMssage<T> {

        @ApiModelProperty("分页起始页")
        private int page;//分页起始页
        @ApiModelProperty("分页起始页")
        private int size;//每页记录数
        @ApiModelProperty("返回的记录集合")
        private List<T> rows;//返回的记录集合
        @ApiModelProperty("总记录条数")
        private long total;//总记录条数

        @ApiModelProperty("事件来源编号")
        private String event_sourceno;
        @ApiModelProperty("事件等级编号")
        private String event_levelno;


        @ApiModelProperty("事件ID")
        private String id;

        @ApiModelProperty("事件等级")
        private String event_level;
        @ApiModelProperty("事件状态编号")
        private String event_sourcetypeno;
        @ApiModelProperty("事件状态")
        private String event_sourcetype;

        @ApiModelProperty("事件类型")
        private String event_lx;

        @ApiModelProperty("事件类型编号")
        private String event_lxno;

        @ApiModelProperty("事件名称")
        private String event_name;

        @ApiModelProperty("事件原因")
        private String event_reason;

        @ApiModelProperty("事件描述")
        private String event_describe;

        @ApiModelProperty("地址")
        private String event_addr;

        @ApiModelProperty("经度（地址）")
        private String event_longitude;

        @ApiModelProperty("纬度（地址）")
        private String event_latitude;

        @ApiModelProperty("事件发生时间")
        private String event_happentime;

        @ApiModelProperty("接报时间")
        private String event_receivetime;

        @ApiModelProperty("报送时间")
        private String event_sendtime;

        @ApiModelProperty("填报人")
        private String event_fillname;

        @ApiModelProperty("填报人电话")
        private String event_fillphone;

        @ApiModelProperty("填报单位")
        private String event_filldept;

        @ApiModelProperty("通话开始时间(3级)")
        private String event_phonestarttime;

        @ApiModelProperty("通话结束时间(3级)")
        private String event_phoneendtime;

        @ApiModelProperty("上报人(3级)")
        private String event_reportname;

        @ApiModelProperty("上报人联系方式(3级)")
        private String event_reportphone;

        @ApiModelProperty("上报人政治面貌(3级)")
        private String event_reportpolitics;

        @ApiModelProperty("接听人姓名(3级)")
        private String event_answername;

        @ApiModelProperty("3级与5级区分标识（3级：0,5级：1）")
        private String event_mssagetype;

        @ApiModelProperty("状态（0：未派发 1：已派发）")
        private String event_cltype;

        @ApiModelProperty("责任单位")
        private String event_responsibilitydept;

        @ApiModelProperty("办理结果")
        private String event_handlemssage;

        @ApiModelProperty("回复内容")
        private String event_resultmssage;

        @ApiModelProperty("通话内容")
        private String event_callmssage;

        @ApiModelProperty("回复时间")
        private String event_resulttime;

        @ApiModelProperty("信息来源")
        private String event_source;

        @ApiModelProperty("创建时间")
        private String event_cjtime;

        @ApiModelProperty("业务编码")
        private String event_ywno;

        @ApiModelProperty("行政区划分码")
        private String event_xzno;
        @ApiModelProperty("事件关联ID")
        private String event_id;

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public String getEvent_level() {
                return event_level;
        }

        public void setEvent_level(String event_level) {
                this.event_level = event_level;
        }

        public String getEvent_sourcetype() {
                return event_sourcetype;
        }

        public void setEvent_sourcetype(String event_sourcetype) {
                this.event_sourcetype = event_sourcetype;
        }

        public String getEvent_lx() {
                return event_lx;
        }

        public void setEvent_lx(String event_lx) {
                this.event_lx = event_lx;
        }

        public String getEvent_lxno() {
                return event_lxno;
        }

        public void setEvent_lxno(String event_lxno) {
                this.event_lxno = event_lxno;
        }

        public String getEvent_name() {
                return event_name;
        }

        public void setEvent_name(String event_name) {
                this.event_name = event_name;
        }

        public String getEvent_reason() {
                return event_reason;
        }

        public void setEvent_reason(String event_reason) {
                this.event_reason = event_reason;
        }

        public String getEvent_describe() {
                return event_describe;
        }

        public void setEvent_describe(String event_describe) {
                this.event_describe = event_describe;
        }

        public String getEvent_addr() {
                return event_addr;
        }

        public void setEvent_addr(String event_addr) {
                this.event_addr = event_addr;
        }

        public String getEvent_longitude() {
                return event_longitude;
        }

        public void setEvent_longitude(String event_longitude) {
                this.event_longitude = event_longitude;
        }

        public String getEvent_latitude() {
                return event_latitude;
        }

        public void setEvent_latitude(String event_latitude) {
                this.event_latitude = event_latitude;
        }

        public String getEvent_happentime() {
                return event_happentime;
        }

        public void setEvent_happentime(String event_happentime) {
                this.event_happentime = event_happentime;
        }

        public String getEvent_receivetime() {
                return event_receivetime;
        }

        public void setEvent_receivetime(String event_receivetime) {
                this.event_receivetime = event_receivetime;
        }

        public String getEvent_sendtime() {
                return event_sendtime;
        }

        public void setEvent_sendtime(String event_sendtime) {
                this.event_sendtime = event_sendtime;
        }

        public String getEvent_fillname() {
                return event_fillname;
        }

        public void setEvent_fillname(String event_fillname) {
                this.event_fillname = event_fillname;
        }

        public String getEvent_fillphone() {
                return event_fillphone;
        }

        public void setEvent_fillphone(String event_fillphone) {
                this.event_fillphone = event_fillphone;
        }

        public String getEvent_filldept() {
                return event_filldept;
        }

        public void setEvent_filldept(String event_filldept) {
                this.event_filldept = event_filldept;
        }

        public String getEvent_phonestarttime() {
                return event_phonestarttime;
        }

        public void setEvent_phonestarttime(String event_phonestarttime) {
                this.event_phonestarttime = event_phonestarttime;
        }

        public String getEvent_phoneendtime() {
                return event_phoneendtime;
        }

        public void setEvent_phoneendtime(String event_phoneendtime) {
                this.event_phoneendtime = event_phoneendtime;
        }

        public String getEvent_reportname() {
                return event_reportname;
        }

        public void setEvent_reportname(String event_reportname) {
                this.event_reportname = event_reportname;
        }

        public String getEvent_reportphone() {
                return event_reportphone;
        }

        public void setEvent_reportphone(String event_reportphone) {
                this.event_reportphone = event_reportphone;
        }

        public String getEvent_reportpolitics() {
                return event_reportpolitics;
        }

        public void setEvent_reportpolitics(String event_reportpolitics) {
                this.event_reportpolitics = event_reportpolitics;
        }

        public String getEvent_answername() {
                return event_answername;
        }

        public void setEvent_answername(String event_answername) {
                this.event_answername = event_answername;
        }

        public String getEvent_mssagetype() {
                return event_mssagetype;
        }

        public void setEvent_mssagetype(String event_mssagetype) {
                this.event_mssagetype = event_mssagetype;
        }

        public String getEvent_cltype() {
                return event_cltype;
        }

        public void setEvent_cltype(String event_cltype) {
                this.event_cltype = event_cltype;
        }

        public String getEvent_responsibilitydept() {
                return event_responsibilitydept;
        }

        public void setEvent_responsibilitydept(String event_responsibilitydept) {
                this.event_responsibilitydept = event_responsibilitydept;
        }

        public String getEvent_handlemssage() {
                return event_handlemssage;
        }

        public void setEvent_handlemssage(String event_handlemssage) {
                this.event_handlemssage = event_handlemssage;
        }

        public String getEvent_resultmssage() {
                return event_resultmssage;
        }

        public void setEvent_resultmssage(String event_resultmssage) {
                this.event_resultmssage = event_resultmssage;
        }

        public String getEvent_callmssage() {
                return event_callmssage;
        }

        public void setEvent_callmssage(String event_callmssage) {
                this.event_callmssage = event_callmssage;
        }

        public String getEvent_resulttime() {
                return event_resulttime;
        }

        public void setEvent_resulttime(String event_resulttime) {
                this.event_resulttime = event_resulttime;
        }

        public String getEvent_source() {
                return event_source;
        }

        public void setEvent_source(String event_source) {
                this.event_source = event_source;
        }
        public String getEvent_sourceno() {
                return event_sourceno;
        }

        public void setEvent_sourceno(String event_sourceno) {
                this.event_sourceno = event_sourceno;
        }

        public String getEvent_levelno() {
                return event_levelno;
        }

        public void setEvent_levelno(String event_levelno) {
                this.event_levelno = event_levelno;
        }

        public String getEvent_sourcetypeno() {
                return event_sourcetypeno;
        }

        public void setEvent_sourcetypeno(String event_sourcetypeno) {
                this.event_sourcetypeno = event_sourcetypeno;
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

        public String getEvent_cjtime() {
                return event_cjtime;
        }

        public void setEvent_cjtime(String event_cjtime) {
                this.event_cjtime = event_cjtime;
        }

        public String getEvent_ywno() {
                return event_ywno;
        }

        public void setEvent_ywno(String event_ywno) {
                this.event_ywno = event_ywno;
        }

        public String getEvent_xzno() {
                return event_xzno;
        }

        public void setEvent_xzno(String event_xzno) {
                this.event_xzno = event_xzno;
        }

        public String getEvent_id() {
                return event_id;
        }

        public void setEvent_id(String event_id) {
                this.event_id = event_id;
        }
}


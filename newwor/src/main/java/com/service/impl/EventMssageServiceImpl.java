package com.service.impl;


import com.Mssage.EventMssage;
import com.Mssage.PlanMssage;
import com.mapper.EventMssagemapper;
import com.mapper.Worksheetmapper;
import com.service.EventMssageService;
import com.util.ErrorDefine;
import com.util.ResponseUtil;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lele
 * @since 2019-06-10
 */
@Slf4j
@Service(value = "eventMssageService")
public class EventMssageServiceImpl implements EventMssageService {
    @Autowired
    public EventMssageServiceImpl(EventMssagemapper eventMssagemapper){
        this.eventMssagemapper = eventMssagemapper;
    }
    private final EventMssagemapper eventMssagemapper;

    @Override
    public JSONObject selectAllEventMssage(Map params){
        List<Map<String,Object>> resultList = new ArrayList<>();
        try{
            params.put("page", (Integer.parseInt(String.valueOf(params.get("page")))-1)*Integer.parseInt(String.valueOf(params.get("size"))));
            params.put("size", Integer.parseInt(String.valueOf(params.get("size"))));
            EventMssage<EventMssage> pager = new EventMssage<EventMssage>();
            List<EventMssage> list =  eventMssagemapper.selectAllEventMssage(params);
            pager.setRows(list);
            pager.setPage(Integer.parseInt(String.valueOf(params.get("page")))+1);
            pager.setSize(Integer.parseInt(String.valueOf(params.get("size"))));
            //Long a=eventMssagemapper.eventAllcount(params);
            pager.setTotal(eventMssagemapper.eventAllcount(params));
           // log.info("查询返回信息详情————————————Total——————》:"+a);
            JSONArray jsonArray = new JSONArray();
            jsonArray = JSONArray.fromObject(pager);
            log.info("查询返回信息详情————————————selectAllEventMssage——————》:"+pager);
            return ResponseUtil.createSuccessResponse(jsonArray.toString());
        }catch (Exception e) {
            log.info("selectAllEventMssage异常信息:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_SELECT_ERROR, "");
    }
    @Override
    public JSONObject selectEventMssage(Map params){
        List<Map<String,Object>> resultList = new ArrayList<>();
        try{
            resultList =  eventMssagemapper.selectEventMssage(params);
            JSONArray jsonArray = new JSONArray();
            jsonArray = JSONArray.fromObject(resultList);
            log.info("查询返回信息详情————————————selectDateMssage——————》:"+resultList);
            return ResponseUtil.createSuccessResponse(jsonArray.toString());
        }catch (Exception e) {
            log.info("selectDateMssage异常信息:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_SELECT_ERROR, "");
    }
    @Override
    public JSONObject selectDateMssage(Map params){
        List<Map<String,Object>> resultList = new ArrayList<>();
        try{
            resultList =  eventMssagemapper.selectDateMssage(params);
            JSONArray jsonArray = new JSONArray();
            jsonArray = JSONArray.fromObject(resultList);
            log.info("查询返回信息详情————————————selectDateMssage——————》:"+resultList);
            return ResponseUtil.createSuccessResponse(jsonArray.toString());
        }catch (Exception e) {
            log.info("selectDateMssage异常信息:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_SELECT_ERROR, "");
    }

    @Override
    public JSONObject insertDataEventMssage(Map params) {
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            DateFormat dateFormatone = new SimpleDateFormat("yyyyMMddHHmmss");
            params.put("event_cjtime",dateFormat.format(new Date()));
            params.put("event_xzno","37089021");
            //生成规则DSJJ+日期时分秒+6位随机数
            String number = "DSJJ"+dateFormatone.format(new Date())+String.valueOf((int)(Math.random()*100000)+1);
            params.put("event_xzno","37089021");
            params.put("event_ywno",number);
            log.info("insertDataEventMssage传入参数——————》:"+params);
            int index = eventMssagemapper.insertDataEventMssage(params);
            if (index > 0){
                return ResponseUtil.createSuccessResponse("添加事件详情成功");
            }
            return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "添加事件详情失败");
        } catch (Exception e) {
            log.info("添加事件详情失败:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "添加事件详情失败");
    }
    @Override
    public JSONObject deleteDataEventMssage(Map params) {
        try {
            int index = eventMssagemapper.deleteDataEventMssage(params);
            if (index > 0){
                return ResponseUtil.createSuccessResponse("删除事件详情成功");
            }
            return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "删除事件详情失败");
        } catch (Exception e) {
            log.info("删除工单失败:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "删除事件详情失败");
    }
    @Override
    public JSONObject updateDataEventMssage(Map params) {
        try {
            int index = eventMssagemapper.updateDataEventMssage(params);
            if (index > 0){
                return ResponseUtil.createSuccessResponse("修改事件详情成功");
            }
            return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "修改事件详情失败");
        } catch (Exception e) {
            log.info("修改事件详情成功:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "修改事件详情失败");
    }

}
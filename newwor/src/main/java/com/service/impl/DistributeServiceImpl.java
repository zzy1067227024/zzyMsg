package com.service.impl;


import com.mapper.Distributemapper;
import com.mapper.Worksheetmapper;
import com.service.DistributeService;
import com.util.ErrorDefine;
import com.util.ResponseUtil;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lele
 * @since 2019-06-10
 */
@Slf4j
@Service(value = "distributeService")
public class DistributeServiceImpl implements DistributeService {
    @Autowired
    public DistributeServiceImpl(Distributemapper distributemapper,Worksheetmapper worksheetmapper){
        this.distributemapper = distributemapper;
        this.worksheetmapper = worksheetmapper;
    }
    private final Distributemapper distributemapper;
    private final Worksheetmapper worksheetmapper;

    @Override
    public JSONObject distributeSheet(Map params){
        try {
            //添加工单详细信息
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            DateFormat dateFormatone = new SimpleDateFormat("yyyyMMddHHmmss");
            String number = "GD"+dateFormatone.format(new Date())+String.valueOf((int)(Math.random()*100000)+1);
            params.put("sheet_no",number);
            params.put("sheet_starttime",dateFormat.format(new Date()));
            int index = worksheetmapper.insertDataWorksheet(params);
            int indextwo = worksheetmapper.updateEventype(params);
            if (index > 0 && indextwo>0){
                List<Map<String,Object>> resultList = new ArrayList<>();
                //工单信息添加成功后 获取工单信息ID
                resultList=worksheetmapper.selectAllWorksheetMssage(params);
                Map<String, Object> resultMap = new HashMap<>();
                resultMap.put("sheet_id",String.valueOf(resultList.get(0).get("id")));
                resultMap.put("event_id",String.valueOf(params.get("event_id")));
                //将节点与工单ID关联
                int indexone=distributemapper.updateNodeone(resultMap);
                if (indexone > 0) {
                    return ResponseUtil.createSuccessResponse("派发工单成功");
                }
            }
            return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "派发工单失败");
        } catch (Exception e) {
            log.info("派发工单失败:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "派发工单失败");
    }

    @Override
    public JSONObject selectNode(Map params){
        List<Map<String,Object>> resultList = new ArrayList<>();
        try{
            resultList =  distributemapper.selectNode(params);
            JSONArray jsonArray = new JSONArray();
            jsonArray = JSONArray.fromObject(resultList);
            log.info("查询返回信息详情————————————selectNode——————》:"+resultList);
            return ResponseUtil.createSuccessResponse(jsonArray.toString());
        }catch (Exception e) {
            log.info("selectNode异常信息:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_SELECT_ERROR, "");
    }
    @Override
    public JSONObject selectNodeMssage(Map params){
        List<Map<String,Object>> resultList = new ArrayList<>();
        try{
            resultList =  distributemapper.selectNodeMssage(params);
            JSONArray jsonArray = new JSONArray();
            jsonArray = JSONArray.fromObject(resultList);
            log.info("查询返回信息详情————————————selectNode——————》:"+resultList);
            return ResponseUtil.createSuccessResponse(jsonArray.toString());
        }catch (Exception e) {
            log.info("selectNode异常信息:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_SELECT_ERROR, "");
    }

    @Override
    public JSONObject insertNode(Map params) {
        try {
            List<Map<String,Object>> resultList = new ArrayList<>();
            resultList=distributemapper.distinctselectnodeMssage(params);
            log.info("查询返回信息详情————————————resultList.size()——————》:"+resultList.size());
            if(resultList.size()!=0){
                if("1".equals(String.valueOf(params.get("node_depttype")))){
                    List<Map<String,Object>> resultListone = new ArrayList<>();
                    resultListone=distributemapper.distinctselectMaxLevel(params);
                    log.info("查询返回信息详情————————————resultListone——————》:"+resultListone);
                    params.put("node_level",String.valueOf(resultListone.get(0).get("maxlevel")));
                }

            }else {
                if("1".equals(String.valueOf(params.get("node_depttype")))){
                    params.put("node_level","1");
                }
            }
            log.info("开始添加节点——————》:");
            int index = distributemapper.insertNode(params);
            if (index > 0){
                List<Map<String,Object>> resultListtwo = new ArrayList<>();
                resultListtwo=distributemapper.selectnodeMssagedate(params);
                JSONArray jsonArray = new JSONArray();
                jsonArray = JSONArray.fromObject(resultListtwo);
                log.info("查询返回信息详情————————————selectAllEventMssage——————》:"+resultListtwo);
                return ResponseUtil.createSuccessResponse(jsonArray.toString());

            }
            return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "添加流程节点失败");
        } catch (Exception e) {
            log.info("添加流程节点失败:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "添加流程节点失败");
    }
    @Override
    public JSONObject deleteALLNode(Map params) {
        try {
            int index = distributemapper.deleteALLNode(params);
            if (index > 0){
                return ResponseUtil.createSuccessResponse("删除流程节点成功");
            }
            return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "删除流程节点失败");
        } catch (Exception e) {
            log.info("删除流程节点失败:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "删除流程节点失败");
    }
    @Override
    public JSONObject updateNode(Map params) {
        try {
            int index = distributemapper.updateNode(params);
            if (index > 0){
                List<Map<String,Object>> resultListtwo = new ArrayList<>();
                resultListtwo=distributemapper.selectnodeMssagedate(params);
                JSONArray jsonArray = new JSONArray();
                jsonArray = JSONArray.fromObject(resultListtwo);
                log.info("查询返回信息详情————————————selectAllEventMssage——————》:"+resultListtwo);
                return ResponseUtil.createSuccessResponse(jsonArray.toString());
            }
            return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "[updateNode]修改流程节点失败");
        } catch (Exception e) {
            log.info("[updateNode]修改流程节点失败"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "[updateNode]修改流程节点失败");
    }
    @Override
    public JSONObject deleteNode(Map params) {
        try {
            int index = distributemapper.deleteNode(params);
            if (index > 0){
                return ResponseUtil.createSuccessResponse("删除流程节点成功");
            }
            return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "删除流程节点失败");
        } catch (Exception e) {
            log.info("删除流程节点失败:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "删除流程节点失败");
    }
    @Override
    public JSONObject fallBackDistribute(Map params) {
        try {
            int index = distributemapper.fallBackDistribute(params);
            if (index > 0){
                return ResponseUtil.createSuccessResponse("[fallBackDistribute]修改流程节点成功");
            }
            return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "[fallBackDistribute]修改流程节点失败");
        } catch (Exception e) {
            log.info("[fallBackDistribute]修改流程节点失败:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "[fallBackDistribute]修改流程节点失败");
    }
    @Override
    public JSONObject spupdatenode(Map params) {
        try {
//退回
                if("2".equals(String.valueOf(params.get("node_type")))){

                        params.put("node_uptype","2");
//
                        int indexone = distributemapper.updatejd(params);
                        //判断是否为督办
                    if("1".equals(String.valueOf(params.get("node_depttype")))){
                        int indextwo = distributemapper.updatedb(params);
                        if (indexone > 0 && indextwo>0){
                            return ResponseUtil.createSuccessResponse("[spupdatenode]修改流程节点成功");
                        }
                    }else {

                        if (indexone > 0){
                            return ResponseUtil.createSuccessResponse("[spupdatenode]修改流程节点成功");
                        }
                    }

                }else {
                    //通过
                    //判断是否为督办
                    if("0".equals(String.valueOf(params.get("node_depttype")))){
                        int indexthree = distributemapper.updatejdadd(params);

                        if (indexthree > 0){
                            List<Map<String,Object>> resultListtwo = distributemapper.selectsum(params);
                            List<Map<String,Object>> resultListthee = distributemapper.selectallnode(params);
                            if((String.valueOf(resultListtwo.get(0).get("node_db"))).equals(String.valueOf(resultListtwo.get(0).get("node_db")))
                                    &&"0".equals(String.valueOf(resultListthee.get(0).get("num")))){
                                int indexfive = distributemapper.upsheeettype(params);
                                int indexsix=distributemapper.upsheeettypedb(params);
                                if (indexfive > 0 && indexsix>0){
                                    return ResponseUtil.createSuccessResponse("[spupdatenode]修改流程节点成功");
                                }
                            }
                            return ResponseUtil.createSuccessResponse("[spupdatenode]修改流程节点成功");
                        }
                    }else {
                        //更新
                        int indexfour = distributemapper.spupdatenode(params);
                        if (indexfour > 0){
                            return ResponseUtil.createSuccessResponse("[spupdatenode]修改流程节点成功");
                        }
                    }

                }


            return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "[spupdatenode]修改流程节点失败");
        } catch (Exception e) {
            log.info("[spupdatenode]修改流程节点失败:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "[spupdatenode]修改流程节点失败");
    }

}
package com.service.impl;

import com.Mssage.PlanMssage;
import com.mapper.Planmapper;
import com.service.PlanService;
import com.util.ErrorDefine;
import com.util.ResponseUtil;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
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
@Service(value = "planService")
public class PlanServiceImpl implements PlanService {
    @Autowired
    public PlanServiceImpl(Planmapper planmapper){
        this.planmapper = planmapper;
    }
    private final Planmapper planmapper;

    @Override
    public JSONObject selectAllPlan(Map params){
        List<Map<String,Object>> resultList = new ArrayList<>();
        try{
            params.put("page", (Integer.parseInt(String.valueOf(params.get("page")))-1)*Integer.parseInt(String.valueOf(params.get("size"))));
            params.put("size", Integer.parseInt(String.valueOf(params.get("size"))));
            PlanMssage<PlanMssage> pager = new PlanMssage<PlanMssage>();
            List<PlanMssage> list =planmapper.selectAllPlan(params);
            pager.setRows(list);
            pager.setTotal(planmapper.Allcount());
            //resultList =
            JSONArray jsonArray = new JSONArray();
            jsonArray = JSONArray.fromObject(pager);
            log.info("查询返回信息详情———————————selectAllPlan———————————————》:"+pager);
            return ResponseUtil.createSuccessResponse(jsonArray.toString());
        }catch (Exception e) {
            log.info("selectAllPlan异常信息"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_SELECT_ERROR, "");
    }

    @Override
    public JSONObject insertDataPlan(Map params) {
        try {
            int index = planmapper.insertDataPlan(params);
            if (index > 0){
                return ResponseUtil.createSuccessResponse("添加预案信息成功");
            }
            return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "添加预案信息失败");
        } catch (Exception e) {
            log.info("添加预案信息失败:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "添加预案信息失败");
    }
    @Override
    public JSONObject deleteDataPlan(Map params) {
        try {
            int index = planmapper.deleteDataPlan(params);
            if (index > 0){
                return ResponseUtil.createSuccessResponse("删除预案信息成功");
            }
            return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "删除预案信息失败");
        } catch (Exception e) {
            log.info("删除预案信息失败:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "删除预案信息失败");
    }
    @Override
    public JSONObject updateDataPlan(Map params) {
        try {
            int index = planmapper.updateDataPlan(params);
            if (index > 0){
                return ResponseUtil.createSuccessResponse("修改预案信息成功");
            }
            return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "修改预案信息失败");
        } catch (Exception e) {
            log.info("修改预案信息成功:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "修改预案信息失败");
    }

}
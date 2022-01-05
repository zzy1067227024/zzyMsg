package com.service.impl;

import com.mapper.Rescuematerialmapper;
import com.service.RescuematerialService;
import com.util.ErrorDefine;
import com.util.ResponseUtil;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
@Service(value = "rescuematerialService")
public class RescuematerialServiceImpl implements RescuematerialService {
    @Autowired
    public RescuematerialServiceImpl(Rescuematerialmapper rescuematerialmapper){
        this.rescuematerialmapper = rescuematerialmapper;
    }
    private final Rescuematerialmapper rescuematerialmapper;

    @Override
    public JSONObject selectAllrescuematerial(Map params){
        List<Map<String,Object>> resultList = new ArrayList<>();
        try{
            resultList =  rescuematerialmapper.selectAllrescuematerial(params);
            JSONArray jsonArray = new JSONArray();
            jsonArray = JSONArray.fromObject(resultList);
            log.info("查询返回信息详情————————————selectAllrescuematerial——————》:"+resultList);
            return ResponseUtil.createSuccessResponse(jsonArray.toString());
        }catch (Exception e) {
            log.info("selectAllrescuematerial异常:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_SELECT_ERROR, "");
    }

    @Override
    public JSONObject insertDataRescuematerial(Map params) {
        try {
            int index = rescuematerialmapper.insertDataRescuematerial(params);
            if (index > 0){
                return ResponseUtil.createSuccessResponse("添加救援物资成功");
            }
            return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "添加救援物资失败");
        } catch (Exception e) {
            log.info("添加救援物资失败:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "添加救援物资失败");
    }
    @Override
    public JSONObject deleteDataRescuematerial(Map params) {
        try {
            int index = rescuematerialmapper.deleteDataRescuematerial(params);
            if (index > 0){
                return ResponseUtil.createSuccessResponse("删除救援物资成功");
            }
            return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "删除救援物资失败");
        } catch (Exception e) {
            log.info("删除救援物资失败:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "删除救援物资失败");
    }
    @Override
    public JSONObject updateDataRescuematerial(Map params) {
        try {
            int index = rescuematerialmapper.updateDataRescuematerial(params);
            if (index > 0){
                return ResponseUtil.createSuccessResponse("修改救援物资成功");
            }
            return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "修改救援物资失败");
        } catch (Exception e) {
            log.info("修改救援物资失败:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "修改救援物资失败");
    }

}
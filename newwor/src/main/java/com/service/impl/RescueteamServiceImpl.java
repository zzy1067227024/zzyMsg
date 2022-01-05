package com.service.impl;

import com.mapper.Rescuematerialmapper;
import com.mapper.Rescueteammapper;
import com.service.RescueteamService;
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
@Service(value = "rescueteamService")
public class RescueteamServiceImpl implements RescueteamService {
    @Autowired
    public RescueteamServiceImpl(Rescueteammapper rescueteammapper){
        this.rescueteammapper = rescueteammapper;
    }
    private final Rescueteammapper rescueteammapper;

    @Override
    public JSONObject selectAllRescueteam(Map params){
        List<Map<String,Object>> resultList = new ArrayList<>();
        try{
            resultList =  rescueteammapper.selectAllRescueteam(params);
            JSONArray jsonArray = new JSONArray();
            jsonArray = JSONArray.fromObject(resultList);
            log.info("查询返回信息详情————————————selectAllRescueteam——————》:"+resultList);
            return ResponseUtil.createSuccessResponse(jsonArray.toString());
        }catch (Exception e) {
            log.info("selectAllRescueteam异常信息:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_SELECT_ERROR, "");
    }

    @Override
    public JSONObject insertDataRescueteam(Map params) {
        try {
            int index = rescueteammapper.insertDataRescueteam(params);
            if (index > 0){
                return ResponseUtil.createSuccessResponse("添加救援队伍成功");
            }
            return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "添加救援队伍失败");
        } catch (Exception e) {
            log.info("添加救援队伍失败:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "添加救援队伍失败");
    }
    @Override
    public JSONObject deleteDataRescueteam(Map params) {
        try {
            int index = rescueteammapper.deleteDataRescueteam(params);
            if (index > 0){
                return ResponseUtil.createSuccessResponse("删除救援队伍成功");
            }
            return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "删除救援队伍失败");
        } catch (Exception e) {
            log.info("删除救援队伍失败:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "删除救援队伍失败");
    }
    @Override
    public JSONObject updateDataRescueteam(Map params) {
        try {
            int index = rescueteammapper.updateDataRescueteam(params);
            if (index > 0){
                return ResponseUtil.createSuccessResponse("修改救援队伍成功");
            }
            return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "修改救援队伍失败");
        } catch (Exception e) {
            log.info("修改救援队伍成功:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "修改救援队伍失败");
    }

}
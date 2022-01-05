package com.service;

import net.sf.json.JSONObject;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lele
 * @since 2019-06-10
 */
public interface PlanService {

    /**
     * 查询预案详细信息
     * @param params
     * @return List
     */
    JSONObject selectAllPlan(Map params);
    /**
     * 添加预案信息
     * @param params
     * @return List
     */
    JSONObject insertDataPlan(Map params);
    /**
     * 删除预案信息
     * @param params
     * @return List
     */
    JSONObject deleteDataPlan(Map params);
    /**
     * 修改预案信息
     * @param params
     * @return List
     */
    JSONObject updateDataPlan(Map params);


}

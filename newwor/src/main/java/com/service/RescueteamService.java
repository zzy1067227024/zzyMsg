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
public interface RescueteamService {

    /**
     * 查询救援队伍详细信息
     * @param params
     * @return List
     */
    JSONObject selectAllRescueteam(Map params);
    /**
     * 添加救援队伍信息
     * @param params
     * @return List
     */
    JSONObject insertDataRescueteam(Map params);
    /**
     * 删除救援队伍信息
     * @param params
     * @return List
     */
    JSONObject deleteDataRescueteam(Map params);
    /**
     * 修改救援队伍信息
     * @param params
     * @return List
     */
    JSONObject updateDataRescueteam(Map params);


}

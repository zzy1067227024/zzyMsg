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
public interface RescuematerialService {

    /**
     * 查询救援物资详细信息
     * @param params
     * @return List
     */
    JSONObject selectAllrescuematerial(Map params);
    /**
     * 添加救援物资信息
     * @param params
     * @return List
     */
    JSONObject insertDataRescuematerial(Map params);
    /**
     * 删除救援物资信息
     * @param params
     * @return List
     */
    JSONObject deleteDataRescuematerial(Map params);
    /**
     * 修改救援物资信息
     * @param params
     * @return List
     */
    JSONObject updateDataRescuematerial(Map params);


}

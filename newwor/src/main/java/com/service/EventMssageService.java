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
public interface EventMssageService {

    /**
     * 查询事件详情信息
     * @param params
     * @return List
     */
    JSONObject selectAllEventMssage(Map params);
    /**
     * 查询事件详情信息
     * @param params
     * @return List
     */
    JSONObject selectEventMssage(Map params);

    /**
     * 添加事件详情
     * @param params
     * @return List
     */
    JSONObject insertDataEventMssage(Map params);
    /**
     * 删除事件详情
     * @param params
     * @return List
     */
    JSONObject deleteDataEventMssage(Map params);
    /**
     * 修改事件详情
     * @param params
     * @return List
     */
    JSONObject updateDataEventMssage(Map params);
    /**
     * 修改事件详情
     * @param params
     * @return List
     */
    JSONObject selectDateMssage(Map params);


}

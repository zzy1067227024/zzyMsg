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
public interface WorksheetService {

    /**
     * 查询工单详细信息
     * @param params
     * @return List
     */
    JSONObject selectAllWorksheet(Map params);
    /**
     * 查询部门信息
     * @param params
     * @return List
     */
    JSONObject selectAllDept(Map params);
    /**
     * 查询工单详细信息
     * @param params
     * @return List
     */
    JSONObject selectAllWorksheetfy(Map params);
    /**
     * 添加工单信息
     * @param params
     * @return List
     */
    JSONObject insertDataWorksheet(Map params);
    /**
     * 删除工单信息
     * @param params
     * @return List
     */
    JSONObject deleteDataWorksheet(Map params);
    /**
     * 修改工单信息
     * @param params
     * @return List
     */
    JSONObject updateDataWorksheet(Map params);
    /**
     * 查询督办列表
     * @param params
     * @return List
     */
    JSONObject selectAllDb(Map params);


}

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
public interface TypeMssageService {

    /**
     * 查询事件类型详细信息（三级）
     * @param params
     * @return List
     */
    JSONObject selectAllTypeMssage(Map params);
    /**
     * 查询事件类型详细信息（三级）-1级
     * @param params
     * @return List
     */
    JSONObject selectAllTypeMssageone(Map params);
    /**
     * 查询事件类型详细信息（三级）-2级
     * @param params
     * @return List
     */
    JSONObject selectAllTypeMssagetwo(Map params);
    /**
     * 查询事件类型详细信息（三级）-3级
     * @param params
     * @return List
     */
    JSONObject selectAllTypeMssagethree(Map params);
    /**
     * 查询事件类型详细信息（五级）
     * @param params
     * @return List
     */
    JSONObject selectAllFtypeMssage(Map params);
    /**
     * 查询事件类型详细信息（五级）-1级
     * @param params
     * @return List
     */
    JSONObject selectAllFtypeMssageone(Map params);
    /**
     * 查询事件类型详细信息（五级）-2级
     * @param params
     * @return List
     */
    JSONObject selectAllFtypeMssagetwo(Map params);
    /**
     * 查询事件类型详细信息（五级）-3级
     * @param params
     * @return List
     */
    JSONObject selectAllFtypeMssagethree(Map params);
    /**
     * 查询事件类型详细信息（五级）-4级
     * @param params
     * @return List
     */
    JSONObject selectAllFtypeMssagefour(Map params);
    /**
     * 查询事件类型详细信息（五级）-5级
     * @param params
     * @return List
     */
    JSONObject selectAllFtypeMssagefive(Map params);

}

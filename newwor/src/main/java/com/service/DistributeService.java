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
public interface DistributeService {

    /**
     * 新增流程节点
     * @param params
     * @return List
     */
    JSONObject insertNode(Map params);
    /**
     * 查询节点详细信息
     * @param params
     * @return List
     */
    JSONObject selectNode(Map params);
    /**
     * 查询节点详细信息
     * @param params
     * @return List
     */
    JSONObject selectNodeMssage(Map params);
    /**
     * 删除流程节点
     * @param params
     * @return List
     */
    JSONObject deleteNode(Map params);
    /**
     * 派发工单
     * @param params
     * @return List
     */
    JSONObject distributeSheet(Map params);
    /**
     * 修改节点
     * @param params
     * @return List
     */
    JSONObject fallBackDistribute(Map params);
    /**
     * 修改节点
     * @param params
     * @return List
     */
    JSONObject spupdatenode(Map params);

    /**
     * 取消派发
     * @param params
     * @return List
     */
    JSONObject deleteALLNode(Map params);
    /**
     * 流程节点状态信息变更
     * @param params
     * @return List
     */
    JSONObject updateNode(Map params);
}

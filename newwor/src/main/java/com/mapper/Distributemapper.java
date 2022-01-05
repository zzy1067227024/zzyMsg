package com.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface Distributemapper {
    /**
     * 查询工单信息
     * @param params
     * @return List
     */
    List selectAllWorksheet(Map params) throws Exception;
    /**
     * 查询添加节点信息
     * @param params
     * @return List
     */
    List distinctselectnodeMssage(Map params) throws Exception;
    /**
     * 查询该节点最大级别
     * @param params
     * @return List
     */
    List distinctselectMaxLevel(Map params) throws Exception;
    /**
     * 查询节点详细信息
     * @param params
     * @return List
     */
    List selectnodeMssagedate(Map params) throws Exception;

    /**
     * 查询该ID下节点详细信息
     * @param params
     * @return List
     */
    List selectNode(Map params) throws Exception;
    /**
     * 根据工单号查询节点详细信息
     * @param params
     * @return List
     */
    List selectNodeMssage(Map params) throws Exception;
    /**
     * 查询节点已审批总和
     * @param params
     * @return List
     */
    List selectsum(Map params) throws Exception;
    /**
     * 查询节点未审批总和
     * @param params
     * @return List
     */
    List selectallnode(Map params) throws Exception;



    /**
     * 添加工单信息
     * @param params
     * @return int
     */
    int insertNode(Map params) throws Exception;
    /**
     * 删除点节
     * @param params
     * @return int
     */
    int deleteNode(Map params) throws Exception;
    /**
     * 删除与此事件关联的全部节点节
     * @param params
     * @return int
     */
    int deleteALLNode(Map params) throws Exception;
    /**
     * 修改节点(派发前自定义节点修改)
     * @param params
     * @return int
     */
    int updateNode(Map params) throws Exception;
    /**
     * 修改节点(点击派发把工单id添加进去)
     * @param params
     * @return int
     */
    int updateNodeone(Map params) throws Exception;
    /**
     * 修改节点
     * @param params
     * @return int
     */
    int fallBackDistribute(Map params) throws Exception;
    /**
     * 修改节点
     * @param params
     * @return int
     */
    int spupdatenode(Map params) throws Exception;
    /**
     * 修改节点(督办的审批次数-1)
     * @param params
     * @return int
     */
    int updatedb(Map params) throws Exception;
    /**
     * 修改节点(退回判断修改普通节点状态)
     * @param params
     * @return int
     */
    int updatejd(Map params) throws Exception;
    /**
     * 修改节点(督办的审批次数+1)
     * @param params
     * @return int
     */
    int updatejdadd(Map params) throws Exception; /**
     /* 修改节点
     * @param params
     * @return int
     */
    int upsheeettype(Map params) throws Exception;
    /**
     * 修改节点
     * @param params
     * @return int
     */
    int upsheeettypedb(Map params) throws Exception;

}

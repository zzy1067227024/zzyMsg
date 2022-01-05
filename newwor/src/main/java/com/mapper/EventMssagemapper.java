package com.mapper;

import com.Mssage.EventMssage;
import com.Mssage.PlanMssage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface EventMssagemapper {
    /**
     * 查询事件详情
     * @param params
     * @return List
     */
    List selectEventMssage(Map params) throws Exception;
    /**
     * 查询事件详情
     * @param params
     * @return List
     */
    List<EventMssage>selectAllEventMssage(Map params) throws Exception;
    Long eventAllcount(Map params) throws Exception;
    /**
     * 查询数据字典
     * @param params
     * @return List
     */
    List selectDateMssage(Map params) throws Exception;
    /**
     * 添加事件详情信息
     * @param params
     * @return int
     */
    int insertDataEventMssage(Map params) throws Exception;
    /**
     * 删除事件详情信息
     * @param params
     * @return int
     */
    int deleteDataEventMssage(Map params) throws Exception;
    /**
     * 修改事件详情信息
     * @param params
     * @return int
     */
    int updateDataEventMssage(Map params) throws Exception;
}

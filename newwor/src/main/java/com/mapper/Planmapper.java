package com.mapper;

import com.Mssage.PlanMssage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Mapper
@Repository
public interface Planmapper {

    List<PlanMssage> selectAllPlan(Map<String, Object> params);

    Long Allcount() throws Exception;
    /**
     * 查询删除预案信息
     * @param params
     * @return List
     */
//    List selectAllPlan(Map params) throws Exception;
    /**
     * 添加预案信息
     * @param params
     * @return int
     */
    int insertDataPlan(Map params) throws Exception;
    /**
     * 删除预案信息
     * @param params
     * @return int
     */
    int deleteDataPlan(Map params) throws Exception;
    /**
     * 修改预案信息
     * @param params
     * @return int
     */
    int updateDataPlan(Map params) throws Exception;
}

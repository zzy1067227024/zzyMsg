package com.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface Rescuematerialmapper {
    /**
     * 查询救援物资信息
     * @param params
     * @return List
     */
    List selectAllrescuematerial(Map params) throws Exception;
    /**
     * 添加救援物资信息
     * @param params
     * @return int
     */
    int insertDataRescuematerial(Map params) throws Exception;
    /**
     * 删除救援物资信息
     * @param params
     * @return int
     */
    int deleteDataRescuematerial(Map params) throws Exception;
    /**
     * 修改救援物资信息
     * @param params
     * @return int
     */
    int updateDataRescuematerial(Map params) throws Exception;
}

package com.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface Rescueteammapper {
    /**
     * 查询救援队伍信息
     * @param params
     * @return List
     */
    List selectAllRescueteam(Map params) throws Exception;
    /**
     * 添加救援队伍信息
     * @param params
     * @return int
     */
    int insertDataRescueteam(Map params) throws Exception;
    /**
     * 删除救援队伍信息
     * @param params
     * @return int
     */
    int deleteDataRescueteam(Map params) throws Exception;
    /**
     * 修改救援队伍信息
     * @param params
     * @return int
     */
    int updateDataRescueteam(Map params) throws Exception;
}

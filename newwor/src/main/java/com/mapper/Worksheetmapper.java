package com.mapper;

import com.Mssage.EventMssage;
import com.Mssage.SheetMssage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface Worksheetmapper {
    /**
     * 查询事件详情(分页)
     * @param params
     * @return List
     */
    List<SheetMssage>selectAllWorksheetfy(Map params) throws Exception;
    /**
     * 查询督办列表(分页)
     * @param params
     * @return List
     */
    List<SheetMssage>selectAllDbfy(Map params) throws Exception;
    Long sheetAllDbcount(Map params) throws Exception;

    /**
     * 查询超时的节点的工单id
     * @param
     * @return List
     */
    List selectAllDb() throws Exception;
    /**
     *查询超时
     * @param
     * @return List
     */
    List selectcs(Map params) throws Exception;
    /**
     *查询已处理
     * @param
     * @return List
     */
    List selectsp(Map params) throws Exception;

    /**
     * 根据登陆账号查询订单号信息
     * @param
     * @return List
     */
    List selectUser(Map params) throws Exception;

    Long sheetAllcount(Map params) throws Exception;
    /**
     * 查询工单信息
     * @param params
     * @return List
     */
    List selectAllWorksheet(Map params) throws Exception;
    /**
     * 查询工单信息
     * @param params
     * @return List
     */
    List selectAllWorksheetMssage(Map params) throws Exception;
    /**
     * 查询部门信息
     * @param params
     * @return List
     */
    List selectAllDept(Map params) throws Exception;
    /**
     * 查询部门信息
     * @param params
     * @return List
     */
    List selectAllDeptTwo(Map params) throws Exception;
    /**
     * 查询工单信息
     * @param params
     * @return List
     */
    List distinctselectAllWorksheet(Map params) throws Exception;
    /**
     * 添加工单信息
     * @param params
     * @return int
     */
    int insertDataWorksheet(Map params) throws Exception;
    /**
     * 修改工单状态工单信息
     * @param params
     * @return int
     */
    int updatesheet(Map params) throws Exception;
    /**
     * 修改事件状态
     * @param params
     * @return int
     */
    int updateEventype(Map params) throws Exception;
    /**
     * 删除工单信息
     * @param params
     * @return int
     */
    int deleteDataWorksheet(Map params) throws Exception;
    /**
     * 修改工单信息
     * @param params
     * @return int
     */
    int updateDataWorksheet(Map params) throws Exception;
}

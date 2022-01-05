package com.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface TypeMssagemapper {
    /**
     * 查询事件类型详细信息（三级）
     * @param params
     * @return List
     */
    List selectAllTypeMssage(Map params) throws Exception;
    /**
     * 查询事件类型详细信息（三级）-1级
     * @param params
     * @return List
     */
    List selectAllTypeMssageone(Map params) throws Exception;
    /**
     * 查询事件类型详细信息（三级）-1级
     * @param params
     * @return List
     */
    List selectAllTypeMssagetwo(Map params) throws Exception;
    /**
     * 查询事件类型详细信息（三级）-1级
     * @param params
     * @return List
     */
    List selectAllTypeMssagethree(Map params) throws Exception;
    /**
     * 查询事件类型详细信息（五级）
     * @param params
     * @return List
     */
    List selectAllFtypeMssage(Map params) throws Exception;
    /**
     * 查询事件类型详细信息（五级）-1级
     * @param params
     * @return List
     */
    List selectAllFtypeMssageone(Map params) throws Exception;
    /**
     * 查询事件类型详细信息（五级）-2级
     * @param params
     * @return List
     */
    List selectAllFtypeMssagetwo(Map params) throws Exception;
    /**
     * 查询事件类型详细信息（五级）-3级
     * @param params
     * @return List
     */
    List selectAllFtypeMssagethree(Map params) throws Exception;
    /**
     * 查询事件类型详细信息（五级）-4级
     * @param params
     * @return List
     */
    List selectAllFtypeMssagefour(Map params) throws Exception;
    /**
     * 查询事件类型详细信息（五级）-5级
     * @param params
     * @return List
     */
    List selectAllFtypeMssagefive(Map params) throws Exception;

}

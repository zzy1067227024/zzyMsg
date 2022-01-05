package com.mapper;

import com.Mssage.SheetMssage;
import com.Mssage.UserMssage;
import net.sf.json.JSONObject;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface UserMssagemapper {
    /**
     * 查询用户详细信息(分页)
     * @param params
     * @return List
     */
    List<UserMssage>selectAllUserFy(Map params) throws Exception;

    Long userAllcount(Map params) throws Exception;

    /**
     * 查询用户详细信息
     * @param params
     * @return List
     */
    List selectAllUserMssage(Map params)throws Exception;
    /**
     * 添加用户详细信息
     * @param params
     * @return int
     */
    int insertUserMssage(Map params) throws Exception;
    /**
     * 删除用户
     * @param params
     * @return int
     */
    int deleteUserMssage(Map params) throws Exception;
    /**
     * 修改用户详细信息
     * @param params
     * @return int
     */
    int updateUserMssage(Map params) throws Exception;

}

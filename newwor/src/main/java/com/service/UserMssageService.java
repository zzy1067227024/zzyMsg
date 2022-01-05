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
public interface UserMssageService {

    /**
     * 查询用户详细信息(分页)
     * @param params
     * @return List
     */
    JSONObject selectAllUser(Map params);
    /**
     * 查询用户详细信息
     * @param params
     * @return List
     */
    JSONObject selectAllUserMssage(Map params);
    /**
     * 查询用户详细信息
     * @param params
     * @return List
     */
    JSONObject selectlogin(Map params);
    /**
     * 登陆校验
     * @param params
     * @return List
     */
    JSONObject insertUserMssage(Map params);
    /**
     * 删除用户
     * @param params
     * @return List
     */
    JSONObject deleteUserMssage(Map params);
    /**
     * 修改用户详细信息
     * @param params
     * @return List
     */
    JSONObject updateUserMssage(Map params);


}

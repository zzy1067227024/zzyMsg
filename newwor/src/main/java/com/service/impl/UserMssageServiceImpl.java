package com.service.impl;


import com.Mssage.EventMssage;
import com.Mssage.UserMssage;
import com.mapper.TypeMssagemapper;
import com.mapper.UserMssagemapper;
import com.service.UserMssageService;
import com.util.ErrorDefine;
import com.util.ResponseUtil;
import com.util.TokenUtil;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lele
 * @since 2019-06-10
 */
@Slf4j
@Service(value = "userMssageService")
public class UserMssageServiceImpl implements UserMssageService {
    @Autowired
    public UserMssageServiceImpl(UserMssagemapper userMssagemapper){
        this.userMssagemapper = userMssagemapper;
    }
    private final UserMssagemapper userMssagemapper;

    @Override
    public JSONObject selectAllUser(Map params){
        List<Map<String,Object>> resultList = new ArrayList<>();
        try{
            params.put("page", (Integer.parseInt(String.valueOf(params.get("page")))-1)*Integer.parseInt(String.valueOf(params.get("size"))));
            params.put("size", Integer.parseInt(String.valueOf(params.get("size"))));
            UserMssage<UserMssage> pager = new UserMssage<UserMssage>();
            List<UserMssage> list =  userMssagemapper.selectAllUserFy(params);
            pager.setRows(list);
            pager.setPage(Integer.parseInt(String.valueOf(params.get("page")))+1);
            pager.setSize(Integer.parseInt(String.valueOf(params.get("size"))));
            //Long a=eventMssagemapper.eventAllcount(params);
            pager.setTotal(userMssagemapper.userAllcount(params));
            // log.info("查询返回信息详情————————————Total——————》:"+a);
            JSONArray jsonArray = new JSONArray();
            jsonArray = JSONArray.fromObject(pager);
            log.info("查询返回信息详情————————————selectAllUser——————》:"+pager);
            return ResponseUtil.createSuccessResponse(jsonArray.toString());
        }catch (Exception e) {
            log.info("selectAllUser异常:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_SELECT_ERROR, "");
    }
    @Override
    public JSONObject selectAllUserMssage(Map params){
        List<Map<String,Object>> resultList = new ArrayList<>();
        try{
            resultList =  userMssagemapper.selectAllUserMssage(params);
            JSONArray jsonArray = new JSONArray();
            jsonArray = JSONArray.fromObject(resultList);
            log.info("查询返回信息详情————————————selectAllTypeMssagetwo——————》:"+resultList);
            return ResponseUtil.createSuccessResponse(jsonArray.toString());
        }catch (Exception e) {
            log.info("selectAllUserMssage异常:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_SELECT_ERROR, "");
    }
    @Override
    public JSONObject selectlogin(Map params){
        List<Map<String,Object>> resultList = new ArrayList<>();
        try{
            resultList =  userMssagemapper.selectAllUserMssage(params);
            if(resultList.size()==0){
                return ResponseUtil.createErrorResponse(ErrorDefine.LOGIN_FAILED, "登陆失败:账号或密码错误");
            }
            TokenUtil token=new TokenUtil();
            resultList.get(0).put("token",String.valueOf(token.token (String.valueOf(params.get("user_no")),String.valueOf(params.get("user_pw")))));
            JSONArray jsonArray = new JSONArray();
            jsonArray = JSONArray.fromObject(resultList);
            log.info("查询返回信息详情————————————selectAllTypeMssagetwo——————》:"+resultList);
            return ResponseUtil.createSuccessResponse(jsonArray.toString());
        }catch (Exception e) {
            log.info("selectlogin异常:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.LOGIN_FAILED, "登陆失败:账号或密码错误");
    }
    @Override
    public JSONObject insertUserMssage(Map params) {
        try {
            int index = userMssagemapper.insertUserMssage(params);
            if (index > 0){
                return ResponseUtil.createSuccessResponse("添加用户详细信息成功");
            }
            return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "添加用户详细信息失败");
        } catch (Exception e) {
            log.info("添加用户详细信息失败:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "添加用户详细信息失败");
    }  @Override
    public JSONObject deleteUserMssage(Map params) {
        try {
            int index = userMssagemapper.deleteUserMssage(params);
            if (index > 0){
                return ResponseUtil.createSuccessResponse("删除用户成功");
            }
            return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "删除用户失败");
        } catch (Exception e) {
            log.info("删除用户失败:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "删除用户失败");
    }
    public JSONObject updateUserMssage(Map params) {
        try {
            int index = userMssagemapper.updateUserMssage(params);
            if (index > 0){
                return ResponseUtil.createSuccessResponse("修改用户详细信息成功");
            }
            return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "修改用户详细信息失败");
        } catch (Exception e) {
            log.info("修改用户详细信息失败:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "修改用户详细信息失败");
    }

}
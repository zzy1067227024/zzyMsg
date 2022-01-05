package com.web;

import com.Mssage.UserMssage;
import com.alibaba.fastjson.JSON;
import com.service.UserMssageService;
import io.swagger.annotations.ApiOperation;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lele
 * @since 2019-06-10
 */
@RestController
@Controller
//@ComponentScan(basePackages = {"com.web.*"})
@RequestMapping("/newWork/User")
public class UserController {

    @Autowired
    private UserMssageService userMssageService;

    /**
     * 查询用户详细信息(分页)
     */
    @RequestMapping(value = "/selectAllUser",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("查询用户详细信息(分页)[必传字段]:page,size")
    JSONObject selectAllUser(@RequestBody(required = false) UserMssage userMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(userMssage), Map.class);
        return userMssageService.selectAllUser(params);
    }
    /**
     * 查询用户详细信息
     */
    @RequestMapping(value = "/selectAllUserMssage",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("查询用户详细信息")
    JSONObject selectAllUserMssage(@RequestBody(required = false) UserMssage userMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(userMssage), Map.class);
        return userMssageService.selectAllUserMssage(params);
    }
    /**
     * 登陆校验
     */
    @RequestMapping(value = "/selectlogin",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("登陆校验[必传字段]:user_no,user_pw")
    JSONObject selectlogin(@RequestBody(required = false) UserMssage userMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(userMssage), Map.class);
        return userMssageService.selectlogin(params);
    }
    /**
     * 添加用户详细信息
     */
    @RequestMapping(value = "/insertUserMssage",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("添加用户详细信息[必传字段]:user_name,user_no,dept_no,dept_name")
    JSONObject insertUserMssage(@RequestBody(required = false) UserMssage userMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(userMssage), Map.class);
        return userMssageService.insertUserMssage(params);
    }
    /**
     * 删除用户
     */
    @RequestMapping(value = "/deleteUserMssage",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("删除用户[必传字段]:id")
    JSONObject deleteUserMssage(@RequestBody(required = false) UserMssage userMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(userMssage), Map.class);
        return userMssageService.deleteUserMssage(params);
    }
    /**
     * 修改用户详细信息
     */
    @RequestMapping(value = "/updateUserMssage",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("删除用户[必传字段]:id,user_no")
    JSONObject updateUserMssage(@RequestBody(required = false) UserMssage userMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(userMssage), Map.class);
        return userMssageService.updateUserMssage(params);
    }

}


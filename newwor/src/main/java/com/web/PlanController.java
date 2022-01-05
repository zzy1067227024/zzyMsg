package com.web;

import com.alibaba.fastjson.JSON;
import com.service.PlanService;
import com.Mssage.PlanMssage;
import io.swagger.annotations.Api;
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
@Api("测试api")
//@ComponentScan(basePackages = {"com.web.*"})
@RequestMapping("/newWork/plan")
public class PlanController {

    @Autowired
    private PlanService planService;

    /**
     * 查询预案详细信息
     */
    @RequestMapping(value = "/selectAllPlan",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("测试信息")
    //@ApiImplicitParam(name = "name", value = "姓名", required = true, dataType = "String", paramType = "path")
    JSONObject selectAllPlan(
            @RequestBody(required = false) PlanMssage plan) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(plan), Map.class);
         return planService.selectAllPlan(params);
    }

    /**
     * 添加预案详细信息
     */
    @RequestMapping(value = "/insertDataPlan")
    @ResponseBody
    JSONObject insertDataPlan(@RequestBody(required = false) Map params) throws Exception {
        return planService.insertDataPlan(params);
    }
    /**
     * 删除预案详细信息
     */
    @RequestMapping(value = "/deleteDataPlan")
    @ResponseBody
    JSONObject deleteDataPlan(@RequestBody(required = false) Map params) throws Exception {
        return planService.deleteDataPlan(params);
    }
    /**
     * 删除预案详细信息
     */
    @RequestMapping(value = "/updateDataPlan")
    @ResponseBody
    JSONObject updateDataPlan(@RequestBody(required = false) Map params) throws Exception {
        return planService.updateDataPlan(params);
    }
}


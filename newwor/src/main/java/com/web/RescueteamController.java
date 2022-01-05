package com.web;

import com.service.PlanService;
import com.service.RescueteamService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/newWork/rescueteam")
public class RescueteamController {

    @Autowired
    private RescueteamService rescueteamService;

    /**
     * 查询救援队伍详细信息
     */
    @RequestMapping(value = "/selectAllRescueteam")
    @ResponseBody
    JSONObject selectAllPlan(@RequestBody(required = false) Map params) throws Exception {
         return rescueteamService.selectAllRescueteam(params);
    }

    /**
     * 添加救援队伍详细信息
     */
    @RequestMapping(value = "/insertDataRescueteam")
    @ResponseBody
    JSONObject insertDataRescueteam(@RequestBody(required = false) Map params) throws Exception {
        return rescueteamService.insertDataRescueteam(params);
    }
    /**
     * 删除救援队伍详细信息
     */
    @RequestMapping(value = "/deleteDataRescueteam")
    @ResponseBody
    JSONObject deleteDataRescueteam(@RequestBody(required = false) Map params) throws Exception {
        return rescueteamService.deleteDataRescueteam(params);
    }
    /**
     * 删除救援队伍详细信息
     */
    @RequestMapping(value = "/updateDataRescueteam")
    @ResponseBody
    JSONObject updateDataRescueteam(@RequestBody(required = false) Map params) throws Exception {
        return rescueteamService.updateDataRescueteam(params);
    }
}


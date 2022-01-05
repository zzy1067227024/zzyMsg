package com.web;

import com.service.RescuematerialService;
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
@RequestMapping("/newWork/rescuematerial")
public class RescuematerialController {

    @Autowired
    private RescuematerialService rescuematerialService;

    /**
     * 查询救援物资详细信息
     */
    @RequestMapping(value = "/selectAllrescuematerial")
    @ResponseBody
    JSONObject selectAllrescuematerial(@RequestBody(required = false) Map params) throws Exception {
         return rescuematerialService.selectAllrescuematerial(params);
    }

    /**
     * 添加救援物资详细信息
     */
    @RequestMapping(value = "/insertDataPlan")
    @ResponseBody
    JSONObject insertDataPlan(@RequestBody(required = false) Map params) throws Exception {
        return rescuematerialService.insertDataRescuematerial(params);
    }
    /**
     * 删除救援物资详细信息
     */
    @RequestMapping(value = "/deleteDataPlan")
    @ResponseBody
    JSONObject deleteDataPlan(@RequestBody(required = false) Map params) throws Exception {
        return rescuematerialService.deleteDataRescuematerial(params);
    }
    /**
     * 删除救援物资详细信息
     */
    @RequestMapping(value = "/updateDataPlan")
    @ResponseBody
    JSONObject updateDataPlan(@RequestBody(required = false) Map params) throws Exception {
        return rescuematerialService.updateDataRescuematerial(params);
    }
}


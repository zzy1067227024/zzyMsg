package com.web;

import com.Mssage.DateMssage;
import com.alibaba.fastjson.JSON;
import com.service.EventMssageService;
import com.Mssage.EventMssage;
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
@Api("事件接口")
//@ComponentScan(basePackages = {"com.web.*"})
@RequestMapping("/newWork/eventmssage")
public class EventMssageController {

    @Autowired
    private EventMssageService eventMssageService;

    /**
     * 查询事件详情信息
     */
    @RequestMapping(value = "/selectAllEventMssage",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("查询事件详情信息[必传字段]:page,size")
    JSONObject selectAllEventMssage(@RequestBody(required = false) EventMssage eventMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(eventMssage), Map.class);
         return eventMssageService.selectAllEventMssage(params);
    }
    /**
     * 查询事件详情信息
     */
    @RequestMapping(value = "/selectEventMssage",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("查询事件详情信息[必传字段]:event_id")
    JSONObject selectEventMssage(@RequestBody(required = false) EventMssage eventMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(eventMssage), Map.class);
        return eventMssageService.selectEventMssage(params);
    }


    /**
     * 添加事件详情信息
     */
    @RequestMapping(value = "/insertDataEventMssage",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("添加事件详情信息[必传字段]:event_mssagetype,")
    JSONObject insertDataEventMssage(@RequestBody(required = false) EventMssage eventMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(eventMssage), Map.class);
        return eventMssageService.insertDataEventMssage(params);
    }
    /**
     * 删除事件详情信息
     */
    @RequestMapping(value = "/deleteDataEventMssage",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("删除事件详情信息")
    JSONObject deleteDataEventMssage(@RequestBody(required = false) Map eventMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(eventMssage), Map.class);
        return eventMssageService.deleteDataEventMssage(params);
    }
    /**
     * 修改事件详情信息
     */
    @RequestMapping(value = "/updateDataEventMssage",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("修改事件详情信息:id为必传")
    JSONObject updateDataEventMssage(@RequestBody(required = false) Map eventMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(eventMssage), Map.class);
        return eventMssageService.updateDataEventMssage(params);
    }
    /**
     * 查询数据字典
     */
    @RequestMapping(value = "/selectDateMssage",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("查询数据字典[必传字段]:ms_zl")
    JSONObject selectDateMssage(@RequestBody(required = false) DateMssage dateMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(dateMssage), Map.class);
        return eventMssageService.selectDateMssage(params);
    }
}


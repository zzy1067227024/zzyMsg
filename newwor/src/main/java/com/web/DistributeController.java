package com.web;

import com.Mssage.SheetMssage;
import com.alibaba.fastjson.JSON;
import com.service.DistributeService;
import com.Mssage.NodeMssage;
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
@Api("用户操作工单/节点接口")
//@ComponentScan(basePackages = {"com.web.*"})
@RequestMapping("/newWork/distribute")
public class DistributeController {

    @Autowired
    private DistributeService distributeService;

    /**
     * 新增流程节点
     */
    @RequestMapping(value = "/insertNode",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("新增流程节点[必传字段]:node_name，node_type，node_depttype，event_id，node_mssage")
    JSONObject insertNode(@RequestBody(required = false) NodeMssage nodeMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(nodeMssage), Map.class);
        return distributeService.insertNode(params);
    }
    /**
     * 查询节点详细信息
     */
    @RequestMapping(value = "/selectNode",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("查询节点详细信息[必传字段]:id")
    JSONObject selectNode(@RequestBody(required = false) NodeMssage nodeMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(nodeMssage), Map.class);
        return distributeService.selectNode(params);
    }

    /**
     * 查询节点详细信息
     */
    @RequestMapping(value = "/selectNodeMssage",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("查询节点详细信息[必传字段]:sheet_id,")
    JSONObject selectNodeMssage(@RequestBody(required = false) NodeMssage nodeMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(nodeMssage), Map.class);
        return distributeService.selectNodeMssage(params);
    }
    /**
     * 删除流程节点
     */
    @RequestMapping(value = "/deleteNode",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("删除流程节点[必传字段]:node_depttype，event_id")
    JSONObject deleteNode(@RequestBody(required = false) NodeMssage nodeMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(nodeMssage), Map.class);
        return distributeService.deleteNode(params);
    }
    /**
     * 修改节点
     */
    @RequestMapping(value = "/fallBackDistribute",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("修改节点用于修改状态[必传字段]:node_type，event_id，node_depttype")
    JSONObject fallBackDistribute(@RequestBody(required = false) NodeMssage nodeMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(nodeMssage), Map.class);
        return distributeService.fallBackDistribute(params);
    }
    /**
     * 修改节点(审批)
     */
    @RequestMapping(value = "/spupdatenode",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("修改节点用于修改状态[必传字段]:node_type,id,sheet_id,node_depttype")
    JSONObject spupdatenode(@RequestBody(required = false) NodeMssage nodeMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(nodeMssage), Map.class);
        return distributeService.spupdatenode(params);
    }
    /**
     * 派发工单
     */
    @RequestMapping(value = "/distributeSheet",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("派发工单[必传字段]:event_id")
    JSONObject distributeSheet(@RequestBody(required = false) SheetMssage sheetMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(sheetMssage), Map.class);
        return distributeService.distributeSheet(params);
    }
    /**
     * 取消派发工单
     */
    @RequestMapping(value = "/deleteALLNode",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("取消派发工单[必传字段]:event_id")
    JSONObject deleteALLNode(@RequestBody(required = false) SheetMssage sheetMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(sheetMssage), Map.class);
        return distributeService.deleteALLNode(params);
    }
    /**
     * 流程节点状态信息变更
     */
    @RequestMapping(value = "/updateNode",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("流程节点状态信息变更[必传字段]:event_id,node_depttype,node_type")
    JSONObject updateNode(@RequestBody(required = false) NodeMssage nodeMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(nodeMssage), Map.class);
        return distributeService.updateNode(params);
    }

}


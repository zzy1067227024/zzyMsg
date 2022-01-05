package com.web;

import com.Mssage.DeptMssage;
import com.Mssage.SheetMssage;
import com.alibaba.fastjson.JSON;
import com.service.WorksheetService;
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
@RequestMapping("/newWork/worksheet")
public class WorksheetController {

    @Autowired
    private WorksheetService worksheetService;

    /**
     * 查询工单详细信息
     */
    @RequestMapping(value = "/selectAllWorksheet",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("查询工单详细信息")
    JSONObject selectAllWorksheet(@RequestBody(required = false) SheetMssage sheetMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(sheetMssage), Map.class);
        return worksheetService.selectAllWorksheet(params);
    }
    /**
     * 查询工单详细信息
     */
    @RequestMapping(value = "/selectAllWorksheetfy",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("查询工单详细信息(分页)[必传字段]:user_no,page,size")
    JSONObject selectAllWorksheetfy(@RequestBody(required = false) SheetMssage sheetMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(sheetMssage), Map.class);
        return worksheetService.selectAllWorksheetfy(params);
    }

    /**
     * 添加工单详细信息
     */
    @RequestMapping(value = "/insertDataWorksheet",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("添加工单详细信息[必传字段]:event_id")
    JSONObject insertDataWorksheet(@RequestBody(required = false) SheetMssage sheetMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(sheetMssage), Map.class);
        return worksheetService.insertDataWorksheet(params);
    }
    /**
     * 删除工单详细信息
     */
    @RequestMapping(value = "/deleteDataWorksheet",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("删除工单详细信息[必传字段]:event_id,id")
    JSONObject deleteDataWorksheet(@RequestBody(required = false)  SheetMssage sheetMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(sheetMssage), Map.class);
        return worksheetService.deleteDataWorksheet(params);
    }
    /**
     * 查询部门信息
     */
    @RequestMapping(value = "/selectAllDept",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("查询部门信息")
    JSONObject selectAllDept(@RequestBody(required = false) DeptMssage deptMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(deptMssage), Map.class);
        return worksheetService.selectAllDept(params);
    }
    /**
     * 修改工单详细信息
     */
    @RequestMapping(value = "/updateDataWorksheet",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("修改工单详细信息[必传字段]:event_id,id")
    JSONObject updateDataWorksheet(@RequestBody(required = false) SheetMssage sheetMssage)throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(sheetMssage), Map.class);
    return worksheetService.updateDataWorksheet(params);
    }
    /**
     * 查询督办列表
     */
    @RequestMapping(value = "/selectAllDb",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("查询督办列表[必传字段]:page,size")
    JSONObject selectAllDb(@RequestBody(required = false) SheetMssage sheetMssage)throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(sheetMssage), Map.class);
        return worksheetService.selectAllDb(params);
    }
}


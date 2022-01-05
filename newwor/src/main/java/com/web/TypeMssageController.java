package com.web;

import com.Mssage.FtypeMssage;
import com.Mssage.TypeMssage;
import com.alibaba.fastjson.JSON;
import com.service.TypeMssageService;
import com.service.WorksheetService;
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
@Api("事件类型查询接口")
//@ComponentScan(basePackages = {"com.web.*"})
@RequestMapping("/newWork/typeMssage")
public class TypeMssageController {

    @Autowired
    private TypeMssageService typeMssageService;

    /**
     * 查询事件类型详细信息（三级）
     */
    @RequestMapping(value = "/selectAllTypeMssage",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("查询事件类型详细信息（三级）")
    JSONObject selectAllTypeMssage(@RequestBody(required = false) TypeMssage typeMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(typeMssage), Map.class);
        return typeMssageService.selectAllTypeMssage(params);
    }
    /**
     * 查询事件类型详细信息（三级）
     */
    @RequestMapping(value = "/selectAllTypeMssagetwo",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("查询事件类型详细信息（三级）-2级 [必传字段]:type_oneno")
    JSONObject selectAllTypeMssagetwo(@RequestBody(required = false) TypeMssage typeMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(typeMssage), Map.class);
        return typeMssageService.selectAllTypeMssagetwo(params);
    }
    /**
     * 查询事件类型详细信息（三级）
     */
    @RequestMapping(value = "/selectAllTypeMssagethree",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("查询事件类型详细信息（三级）-3级 [必传字段]:type_twono")
    JSONObject selectAllTypeMssagethree(@RequestBody(required = false) TypeMssage typeMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(typeMssage), Map.class);
        return typeMssageService.selectAllTypeMssagethree(params);
    }
    /**
     * 查询事件类型详细信息（三级）
     */
    @RequestMapping(value = "/selectAllTypeMssageone",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("查询事件类型详细信息（三级）-1级")
    JSONObject selectAllTypeMssageone(@RequestBody(required = false) TypeMssage typeMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(typeMssage), Map.class);
        return typeMssageService.selectAllTypeMssageone(params);
    }
    /**
     * 查询事件类型详细信息（五级）
     */
    @RequestMapping(value = "/selectAllFtypeMssage",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("查询事件类型详细信息（五级）")
    JSONObject selectAllFtypeMssage(@RequestBody(required = false) FtypeMssage ftypeMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(ftypeMssage), Map.class);
        return typeMssageService.selectAllFtypeMssage(params);
    }
    /**
     * 查询事件类型详细信息（五级）-1级
     */
    @RequestMapping(value = "/selectAllFtypeMssageone",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("查询事件类型详细信息（五级）-1级 ")
    JSONObject selectAllFtypeMssageone(@RequestBody(required = false) FtypeMssage ftypeMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(ftypeMssage), Map.class);
        return typeMssageService.selectAllFtypeMssageone(params);
    }
    /**
     * 查询事件类型详细信息（五级）
     */
    @RequestMapping(value = "/selectAllFtypeMssagetwo",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("查询事件类型详细信息（五级）-2级 [必传字段]:ftype_oneno")
    JSONObject selectAllFtypeMssagetwo(@RequestBody(required = false) FtypeMssage ftypeMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(ftypeMssage), Map.class);
        return typeMssageService.selectAllFtypeMssagetwo(params);
    }
    /**
     * 查询事件类型详细信息（五级）
     */
    @RequestMapping(value = "/selectAllFtypeMssagethree",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("查询事件类型详细信息（五级）-3级 [必传字段]:ftype_twono")
    JSONObject selectAllFtypeMssagethree(@RequestBody(required = false) FtypeMssage ftypeMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(ftypeMssage), Map.class);
        return typeMssageService.selectAllFtypeMssagethree(params);
    }
    /**
     * 查询事件类型详细信息（五级）
     */
    @RequestMapping(value = "/selectAllFtypeMssagefour",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("查询事件类型详细信息（五级）-4级 [必传字段]:ftype_threeno")
    JSONObject selectAllFtypeMssagefour(@RequestBody(required = false) FtypeMssage ftypeMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(ftypeMssage), Map.class);
        return typeMssageService.selectAllFtypeMssagefour(params);
    }
    /**
     * 查询事件类型详细信息（五级）
     */
    @RequestMapping(value = "/selectAllFtypeMssagefive",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("查询事件类型详细信息（五级）-5级 [必传字段]:ftype_fourno")
    JSONObject selectAllFtypeMssagefive(@RequestBody(required = false) FtypeMssage ftypeMssage) throws Exception {
        Map params = JSON.parseObject(JSON.toJSONString(ftypeMssage), Map.class);
        return typeMssageService.selectAllFtypeMssagefive(params);
    }
}


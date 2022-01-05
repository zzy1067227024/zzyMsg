package com.web;

import com.service.HkInterfaceService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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
@RequestMapping("/newWork/hkinterface")
public class HkInterfaceController {

    @Autowired
    private HkInterfaceService hkInterfaceService;
    /**
     * 获取视频预览url
     */
    @RequestMapping(value = "/previewURLs")
    @ResponseBody
    JSONObject previewURLs(@RequestBody(required = false) Map params) throws Exception {
        return hkInterfaceService.previewURLs(params);
    }
    /**
     * 根据监控点编号进行云台操作
     */
    @RequestMapping(value = "/controlling")
    @ResponseBody
    JSONObject controlling(@RequestBody(required = false) Map params) throws Exception {
        return hkInterfaceService.controlling(params);
    }
    /**
     * 根据监控点编号和时间获取视频回放url
     */
    @RequestMapping(value = "/playbackURLs")
    @ResponseBody
    JSONObject playbackURLs(@RequestBody(required = false) Map params) throws Exception {
        return hkInterfaceService.playbackURLs(params);
    }
}

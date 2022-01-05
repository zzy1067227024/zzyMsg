package com.service;

import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lele
 * @since 2019-06-10
 */
public interface HkInterfaceService {

    /**
     * 获取视频预览url
     * @param params
     * @return List
     */
    JSONObject previewURLs(Map params);
    /**
     * 根据监控点编号进行云台操作
     * @param params
     * @return List
     */
    JSONObject controlling(Map params);
    /**
     * 根据监控点编号和时间获取视频回放url
     * @param params
     * @return List
     */
    JSONObject playbackURLs(Map params);
}

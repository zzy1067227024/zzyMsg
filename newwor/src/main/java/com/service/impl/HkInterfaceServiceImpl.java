package com.service.impl;


import com.mapper.Planmapper;
import com.service.HkInterfaceService;
import com.util.ErrorDefine;
import com.util.HkUtil;
import com.util.ResponseUtil;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lele
 * @since 2019-06-10
 */
@Slf4j
@Service(value = "hkinterfaceService")
public class HkInterfaceServiceImpl implements HkInterfaceService {
   //@Autowired
//    public PlanServiceImpl(HkUtil Hkutil){
//        this.Hkutil = Hkutil;
//    }
    //HkUtil Hkutil=new HkUtil();
    public HkUtil Hkutil ;
    @Override
    public JSONObject previewURLs(Map params){
        try{
            String resultList=Hkutil.GetCameraPreviewURL(params,"/api/video/v1/cameras/previewURLs");
            log.info("查询接口返回信息详情————————————previewURLs——————》:"+resultList);
            return ResponseUtil.createSuccessResponse(resultList);
        }catch (Exception e) {
            log.info("previewURLs异常信息:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_SELECT_ERROR, "");
    }

    @Override
    public JSONObject controlling(Map params){
        try{
            String resultList=Hkutil.GetCameraPreviewURL(params,"/api/video/v1/ptzs/controlling");
            log.info("查询接口返回信息详情————————————controlling——————》:"+resultList);
            return ResponseUtil.createSuccessResponse(resultList);
        }catch (Exception e) {
            log.info("controlling异常信息:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_SELECT_ERROR, "");
    }
    @Override
    public JSONObject playbackURLs(Map params){
        try{
            String resultList=Hkutil.GetCameraPreviewURL(params,"/api/video/v1/cameras/playbackURLs");
            log.info("查询接口返回信息详情————————————playbackURLs——————》:"+resultList);
            return ResponseUtil.createSuccessResponse(resultList);
        }catch (Exception e) {
            log.info("playbackURLs异常信息:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_SELECT_ERROR, "");
    }

}
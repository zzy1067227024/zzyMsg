package com.service.impl;


import com.mapper.TypeMssagemapper;
import com.mapper.Worksheetmapper;
import com.service.TypeMssageService;
import com.service.WorksheetService;
import com.util.ErrorDefine;
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
@Service(value = "typeMssageService")
public class TypeMssageServiceImpl implements TypeMssageService {
    @Autowired
    public TypeMssageServiceImpl(TypeMssagemapper typeMssagemapper){
        this.typeMssagemapper = typeMssagemapper;
    }
    private final TypeMssagemapper typeMssagemapper;

    @Override
    public JSONObject selectAllTypeMssage(Map params){
        List<Map<String,Object>> resultList = new ArrayList<>();
        try{
            resultList =  typeMssagemapper.selectAllTypeMssage(params);
            JSONArray jsonArray = new JSONArray();
            jsonArray = JSONArray.fromObject(resultList);
            log.info("查询返回信息详情————————————selectAllTypeMssage——————》:"+resultList);
            return ResponseUtil.createSuccessResponse(jsonArray.toString());
        }catch (Exception e) {
            log.info("selectAllTypeMssage异常:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_SELECT_ERROR, "");
    }
    @Override
    public JSONObject selectAllTypeMssageone(Map params){
        List<Map<String,Object>> resultList = new ArrayList<>();
        try{
            resultList =  typeMssagemapper.selectAllTypeMssageone(params);
            JSONArray jsonArray = new JSONArray();
            jsonArray = JSONArray.fromObject(resultList);
            log.info("查询返回信息详情————————————selectAllTypeMssage——————》:"+resultList);
            return ResponseUtil.createSuccessResponse(jsonArray.toString());
        }catch (Exception e) {
            log.info("selectAllTypeMssageone异常:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_SELECT_ERROR, "");
    }
    @Override
    public JSONObject selectAllTypeMssagetwo(Map params){
        List<Map<String,Object>> resultList = new ArrayList<>();
        try{
            resultList =  typeMssagemapper.selectAllTypeMssagetwo(params);
            JSONArray jsonArray = new JSONArray();
            jsonArray = JSONArray.fromObject(resultList);
            log.info("查询返回信息详情————————————selectAllTypeMssagetwo——————》:"+resultList);
            return ResponseUtil.createSuccessResponse(jsonArray.toString());
        }catch (Exception e) {
            log.info("selectAllTypeMssagetwo异常:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_SELECT_ERROR, "");
    }
    @Override
    public JSONObject selectAllTypeMssagethree(Map params){
        List<Map<String,Object>> resultList = new ArrayList<>();
        try{
            resultList =  typeMssagemapper.selectAllTypeMssagethree(params);
            JSONArray jsonArray = new JSONArray();
            jsonArray = JSONArray.fromObject(resultList);
            log.info("查询返回信息详情————————————selectAllTypeMssagethree——————》:"+resultList);
            return ResponseUtil.createSuccessResponse(jsonArray.toString());
        }catch (Exception e) {
            log.info("selectAllTypeMssagethree异常:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_SELECT_ERROR, "");
    }
    @Override
    public JSONObject selectAllFtypeMssage(Map params){
        List<Map<String,Object>> resultList = new ArrayList<>();
        try{
            resultList =  typeMssagemapper.selectAllFtypeMssage(params);
            JSONArray jsonArray = new JSONArray();
            jsonArray = JSONArray.fromObject(resultList);
            log.info("查询返回信息详情————————————selectAllFtypeMssage——————》:"+resultList);
            return ResponseUtil.createSuccessResponse(jsonArray.toString());
        }catch (Exception e) {
            log.info("selectAllFtypeMssage异常:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_SELECT_ERROR, "");
    }
    @Override
    public JSONObject selectAllFtypeMssageone(Map params){
        List<Map<String,Object>> resultList = new ArrayList<>();
        try{
            resultList =  typeMssagemapper.selectAllFtypeMssageone(params);
            JSONArray jsonArray = new JSONArray();
            jsonArray = JSONArray.fromObject(resultList);
            log.info("查询返回信息详情————————————selectAllFtypeMssageone——————》:"+resultList);
            return ResponseUtil.createSuccessResponse(jsonArray.toString());
        }catch (Exception e) {
            log.info("selectAllFtypeMssageone异常:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_SELECT_ERROR, "");
    }
    @Override
    public JSONObject selectAllFtypeMssagetwo(Map params){
        List<Map<String,Object>> resultList = new ArrayList<>();
        try{
            resultList =  typeMssagemapper.selectAllFtypeMssagetwo(params);
            JSONArray jsonArray = new JSONArray();
            jsonArray = JSONArray.fromObject(resultList);
            log.info("查询返回信息详情————————————selectAllFtypeMssagetwo——————》:"+resultList);
            return ResponseUtil.createSuccessResponse(jsonArray.toString());
        }catch (Exception e) {
            log.info("selectAllFtypeMssagetwo异常:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_SELECT_ERROR, "");
    }
    @Override
    public JSONObject selectAllFtypeMssagethree(Map params){
        List<Map<String,Object>> resultList = new ArrayList<>();
        try{
            resultList =  typeMssagemapper.selectAllFtypeMssagethree(params);
            JSONArray jsonArray = new JSONArray();
            jsonArray = JSONArray.fromObject(resultList);
            log.info("查询返回信息详情————————————selectAllFtypeMssagethree——————》:"+resultList);
            return ResponseUtil.createSuccessResponse(jsonArray.toString());
        }catch (Exception e) {
            log.info("selectAllFtypeMssagethree异常:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_SELECT_ERROR, "");
    }
    @Override
    public JSONObject selectAllFtypeMssagefour(Map params){
        List<Map<String,Object>> resultList = new ArrayList<>();
        try{
            resultList =  typeMssagemapper.selectAllFtypeMssagefour(params);
            JSONArray jsonArray = new JSONArray();
            jsonArray = JSONArray.fromObject(resultList);
            log.info("查询返回信息详情————————————selectAllFtypeMssagefour——————》:"+resultList);
            return ResponseUtil.createSuccessResponse(jsonArray.toString());
        }catch (Exception e) {
            log.info("selectAllFtypeMssagefour异常:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_SELECT_ERROR, "");
    }
    @Override
    public JSONObject selectAllFtypeMssagefive(Map params){
        List<Map<String,Object>> resultList = new ArrayList<>();
        try{
            resultList =  typeMssagemapper.selectAllFtypeMssagefive(params);
            JSONArray jsonArray = new JSONArray();
            jsonArray = JSONArray.fromObject(resultList);
            log.info("查询返回信息详情————————————selectAllFtypeMssagefive——————》:"+resultList);
            return ResponseUtil.createSuccessResponse(jsonArray.toString());
        }catch (Exception e) {
            log.info("selectAllFtypeMssagefive异常:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_SELECT_ERROR, "");
    }
}
package com.service.impl;


import com.Mssage.EventMssage;
import com.Mssage.SheetMssage;
import com.mapper.Worksheetmapper;
import com.service.WorksheetService;
import com.util.ErrorDefine;
import com.util.ResponseUtil;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
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
@Service(value = "worksheetService")
public class WorksheetServiceImpl implements WorksheetService {
    @Autowired
    public WorksheetServiceImpl(Worksheetmapper worksheetmapper){
        this.worksheetmapper = worksheetmapper;
    }
    private final Worksheetmapper worksheetmapper;

    @Override
    public JSONObject selectAllWorksheet(Map params){
        List<Map<String,Object>> resultList = new ArrayList<>();
        try{
            resultList =  worksheetmapper.selectAllWorksheet(params);
            JSONArray jsonArray = new JSONArray();
            jsonArray = JSONArray.fromObject(resultList);
            log.info("查询返回信息详情————————————selectAllWorksheet——————》:"+resultList);
            return ResponseUtil.createSuccessResponse(jsonArray.toString());
        }catch (Exception e) {
            log.info("selectAllWorksheet异常:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_SELECT_ERROR, "");
    }
    @Override
    public JSONObject selectAllDept(Map params){
        List<Map<String,Object>> resultList = new ArrayList<>();
        try{
            resultList =  worksheetmapper.selectAllDept(params);
            for(int i=0;i<resultList.size();i++){
                List<Map<String,Object>> resultListone = new ArrayList<>();
                HashMap<String, Object> entity = new HashMap<>();
                entity.put("dept_oneno",String.valueOf(resultList.get(i).get("dept_oneno")));
                resultListone =  worksheetmapper.selectAllDeptTwo(entity);
                resultList.get(i).put("children",resultListone);
            }
            JSONArray jsonArray = new JSONArray();
            jsonArray = JSONArray.fromObject(resultList);
            log.info("查询返回信息详情————————————selectAllWorksheet——————》:"+resultList);
            return ResponseUtil.createSuccessResponse(jsonArray.toString());
        }catch (Exception e) {
            log.info("selectAllDept异常:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_SELECT_ERROR, "");
    }
    @Override
    public JSONObject selectAllWorksheetfy(Map params){
        List<Map<String,Object>> resultList = new ArrayList<>();
        try{
            params.put("page", (Integer.parseInt(String.valueOf(params.get("page")))-1)*Integer.parseInt(String.valueOf(params.get("size"))));
            params.put("size", Integer.parseInt(String.valueOf(params.get("size"))));
            SheetMssage<SheetMssage> pager = new SheetMssage<SheetMssage>();
            //判断是否为admin账户
            if(!"admin".equals(String.valueOf(params.get("user_no")))){
                List<Map<String, Object>> resultListUser = worksheetmapper.selectUser(params);
                //判断工号所在机构下是否存在工单
                if(resultListUser.size()==0){
                    List<SheetMssage> list =new ArrayList<SheetMssage>();;
                    pager.setRows(list);
                }else {
                    String sheet_id = "";
                    for (int i = 0; i < resultList.size(); i++) {
                        if (i == 0) {
                            sheet_id = String.valueOf(resultList.get(i).get("sheet_id"));
                        } else {
                            sheet_id = sheet_id + "," + String.valueOf(resultList.get(i).get("sheet_id"));
                        }
                    }
                    params.put("sheet_ids", sheet_id);
                    List<SheetMssage> list =  worksheetmapper.selectAllWorksheetfy(params);
                    for(int j=0;j<list.size();j++){
                        HashMap<String, Object> entity = new HashMap<>();
                        entity.put("sheet_id",String.valueOf(list.get(j).getId()));
                        List<Map<String,Object>> resultListcs = worksheetmapper.selectcs(entity);
                        //判断是否超时
                        if(!"2".equals(list.get(j).getSheet_cltype())){
                            if(resultListcs.size()!=0){
                                list.get(j).setSheet_cltype("3");
                            }else {
                                //判断是否已处理
                                List<Map<String,Object>> resultListsp = worksheetmapper.selectsp(entity);
                                if(resultListsp.size()!=0){
                                    list.get(j).setSheet_cltype("1");
                                }else {
                                    list.get(j).setSheet_cltype("2");
                                }
                            }
                        }

                    }
                    pager.setRows(list);
                    pager.setTotal(worksheetmapper.sheetAllcount(params));
                }
            }else {
                List<SheetMssage> list =  worksheetmapper.selectAllWorksheetfy(params);
                for(int j=0;j<list.size();j++) {
                    HashMap<String, Object> entity = new HashMap<>();
                    System.out.println("list.get(j).getId():" + list.get(j).getId());
                    entity.put("sheet_id", String.valueOf(list.get(j).getId()));
                    List<Map<String, Object>> resultListcs = worksheetmapper.selectcs(entity);
                    //判断是否超时
                    if (!"2".equals(list.get(j).getSheet_cltype())) {

                    if (resultListcs.size() != 0) {
                        list.get(j).setSheet_cltype("3");
                        entity.put("sheet_cltype", "3");
                        int index = worksheetmapper.updatesheet(entity);
                    } else {
                        //判断是否已处理
                        List<Map<String, Object>> resultListsp = worksheetmapper.selectsp(entity);
                        if (resultListsp.size() != 0) {
                            list.get(j).setSheet_cltype("1");
                            entity.put("sheet_cltype", "1");
                            int index = worksheetmapper.updatesheet(entity);
                        } else {
                            list.get(j).setSheet_cltype("2");
                            entity.put("sheet_cltype", "2");
                            int index = worksheetmapper.updatesheet(entity);
                        }
                    }
                }
                }
                pager.setRows(list);
                pager.setTotal(worksheetmapper.sheetAllcount(params));
            }
            pager.setPage(Integer.parseInt(String.valueOf(params.get("page")))+1);
            pager.setSize(Integer.parseInt(String.valueOf(params.get("size"))));
            JSONArray jsonArray = new JSONArray();
            jsonArray = JSONArray.fromObject(pager);
            log.info("查询返回信息详情————————————selectAllWorksheet——————》:"+resultList);
            return ResponseUtil.createSuccessResponse(jsonArray.toString());
        }catch (Exception e) {
            log.info("selectAllWorksheetfy异常:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_SELECT_ERROR, "");
    }
    @Override
    public JSONObject selectAllDb(Map params){

        try {
            params.put("page", (Integer.parseInt(String.valueOf(params.get("page"))) - 1) * Integer.parseInt(String.valueOf(params.get("size"))));
            params.put("size", Integer.parseInt(String.valueOf(params.get("size"))));
            List<Map<String, Object>> resultList = new ArrayList<>();
            SheetMssage<SheetMssage> pager = new SheetMssage<SheetMssage>();
            //查询已派发且超时的工单id
            resultList = worksheetmapper.selectAllDb();
            String sheet_id = "";
            if (resultList.size() == 0) {
                List<SheetMssage> list =new ArrayList<SheetMssage>();
                pager.setRows(list);
                pager.setTotal(0);
            } else {
                for (int i = 0; i < resultList.size(); i++) {
                    if (i == 0) {
                        sheet_id = String.valueOf(resultList.get(i).get("sheet_id"));
                    } else {
                        sheet_id = sheet_id + "," + String.valueOf(resultList.get(i).get("sheet_id"));
                    }
                }
                params.put("sheet_id", sheet_id);
                List<SheetMssage> list = worksheetmapper.selectAllDbfy(params);
                pager.setRows(list);
                pager.setTotal(worksheetmapper.sheetAllDbcount(params));
            }
            pager.setPage(Integer.parseInt(String.valueOf(params.get("page"))) + 1);
            pager.setSize(Integer.parseInt(String.valueOf(params.get("size"))));
            JSONArray jsonArray = new JSONArray();
            jsonArray = JSONArray.fromObject(pager);
            log.info("查询返回信息详情————————————selectAllWorksheet——————》:" + pager);
            return ResponseUtil.createSuccessResponse(jsonArray.toString());

        }catch (Exception e) {
            log.info("selectAllDb异常:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_SELECT_ERROR, "");
    }
    @Override
    public JSONObject insertDataWorksheet(Map params) {
        try {
            int index = worksheetmapper.insertDataWorksheet(params);
            if (index > 0){
                return ResponseUtil.createSuccessResponse("添加工单成功");
            }
            return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "添加工单失败");
        } catch (Exception e) {
            log.info("添加工单失败:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "添加工单失败");
    }
    @Override
    public JSONObject deleteDataWorksheet(Map params) {
        try {
            int index = worksheetmapper.deleteDataWorksheet(params);
            if (index > 0){
                return ResponseUtil.createSuccessResponse("删除工单成功");
            }
            return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "删除工单失败");
        } catch (Exception e) {
            log.info("删除工单失败:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "删除工单失败");
    }
    @Override
    public JSONObject updateDataWorksheet(Map params) {
        try {
            int index = worksheetmapper.updateDataWorksheet(params);
            if (index > 0){
                return ResponseUtil.createSuccessResponse("修改工单成功");
            }
            return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "修改工单失败");
        } catch (Exception e) {
            log.info("修改救援队伍失败:"+e.getMessage());
        }
        return ResponseUtil.createErrorResponse(ErrorDefine.DATABASE_INSERT_ERROR, "修改工单失败");
    }

}
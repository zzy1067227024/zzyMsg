package com.util;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * AJAX请求，公共返回报文定义
 * @author GGUI
 *
 */
public class ResponseUtil {
	
	public final static String rspCode = "rspCode";
	public final static String errorMsg = "errorMsg";
	public final static String data = "data";
	public final static String responseSuccess = "00";

	public static JSONObject createErrorResponse(String rc, String d){
		JSONObject json = new JSONObject();
		json.put(rspCode, rc);
		json.put(errorMsg, ErrorDefine.errorInfo.get(rc));
		json.put(data, d);
		return json;
	}
	public static JSONObject createErrorResponse2(String rc, String errormsg){
		JSONObject json = new JSONObject();
		json.put(rspCode, rc);
		json.put(errorMsg, errormsg);
		json.put(data, "");
		return json;
	}
	public static JSONObject createSuccessResponse(String d){
		JSONObject json = new JSONObject();
		json.put(rspCode, responseSuccess);
		json.put(errorMsg, "");
		json.put(data, d);
		return json;
	}
	public static JSONObject createSuccessResponse(){
		JSONObject json = new JSONObject();
		json.put(rspCode, responseSuccess);
		json.put(errorMsg, "success");
		return json;
	}
	public static JSONObject createSuccessLayTable(JSONArray d,List<Map<String, Object>> count){
		JSONObject json = new JSONObject();
		json.put("code", 0);
		json.put("msg", "");
		json.put("count", ((BigDecimal) count.get(0).get("COUNT")).intValue());
		json.put(data, d.toString());
		return json;
	}
	
	//受理失败返回报文格式
	public static JSONObject createErrorAppResponse(String error, JSONObject d){
		JSONObject json = new JSONObject();
		json.put("resultCode", 1);
		json.put("resultInfo", error);
		json.put("data", d);
		return json;
	}
	
	//受理成功返回报文格式
	public static JSONObject createSuccessAppResponse(JSONObject d){
		JSONObject json = new JSONObject();
		json.put("resultCode", 0);
		json.put("resultInfo", "成功");
		json.put(data, d.toString());
		return json;
		
	}
	//受理成功返回报文格式
	public static JSONObject createSuccessPushAppResponse(JSONObject d){
		JSONObject json = new JSONObject();
		json.put(data, d.toString());
		return json;
		
	}
	
}

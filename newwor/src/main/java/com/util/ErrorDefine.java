package com.util;

import java.util.HashMap;
import java.util.Map;

public class ErrorDefine {
	public static Map<String, String> errorInfo = new HashMap<String, String>();
	public final static String DATABASE_ERROR = "99";
	public final static String DATABASE_INSERT_ERROR = "0001";
	public final static String DATABASE_SELECT_ERROR = "0002";
	public final static String DATABASE_DELETE_ERROR = "0003";
	public final static String DATABASE_UPDATE_ERROR = "0004";

	public final static String SESSION_ERROR = "-1";

	public final static String LOGIN_ALREADY_LOGIN = "88";//已登陆
	public final static String LOGIN_FAILED = "99";//登陆异常
	public final static String LOGIN_NO_USER = "01";//用户不存在
	public final static String LOGIN_USER_UNAVAILABLE = "02";//用户不可用
	public final static String LOGIN_USER_LOCK = "03";//用户被锁定
	public final static String LOGIN_USER_INIT = "04";//初始用户
	public final static String LOGIN_PASSWD_ERROR_LOCK = "05";//密码错误，超限
	public final static String LOGIN_PASSWD_ERROR = "06";//密码错误

	public final static String VALIDATION_FAILED = "1001";//检验未通过

	public final static String INTERFACE_RETURNDATA_ERROR = "001";  //接口返回数据为空
	public final static String INTERFACE_VERIFYSIGNATURE_ERROR = "002";  //验签不通过
	public final static String INTERFACE_STANDARD_ERROR = "003";  //接口返回数据不符合规范

	public final static String SERVER_ERROR = "999";
	public final static String PORT_ERROR = "888";
	static{
		errorInfo.put(DATABASE_ERROR, "数据库异常");
		errorInfo.put(DATABASE_INSERT_ERROR, "数据库入库异常");
		errorInfo.put(DATABASE_SELECT_ERROR, "数据库查询异常");
		errorInfo.put(DATABASE_DELETE_ERROR, "数据库删除异常");
		errorInfo.put(DATABASE_UPDATE_ERROR, "数据库修改异常");
		errorInfo.put(SESSION_ERROR, "SESSION校验未通过");
		errorInfo.put(LOGIN_ALREADY_LOGIN, "该用户已登录，是否强制登录？");
		errorInfo.put(LOGIN_FAILED, "登陆后台处理异常，请联系-->系统管理员！");
		errorInfo.put(LOGIN_NO_USER, "您输入的用户不存在！");
		errorInfo.put(LOGIN_USER_UNAVAILABLE, "您输入的用户不可用！");
		errorInfo.put(LOGIN_USER_LOCK, "您输入的用户已被锁定！");
		errorInfo.put(LOGIN_USER_INIT, "您输入的用户为初始用户，请修改密码！");
		errorInfo.put(LOGIN_PASSWD_ERROR_LOCK, "登陆密码错误超限，账户被锁定！");
		errorInfo.put(LOGIN_PASSWD_ERROR, "登陆密码错误！");
		errorInfo.put(VALIDATION_FAILED, "检验未通过！");

		errorInfo.put(INTERFACE_RETURNDATA_ERROR,"接口返回数据为空");
		errorInfo.put(INTERFACE_VERIFYSIGNATURE_ERROR,"验签不通过");
		errorInfo.put(INTERFACE_STANDARD_ERROR,"接口返回数据不符合规范");
        errorInfo.put(SERVER_ERROR,"服务器异常,请稍后再试");
		errorInfo.put(PORT_ERROR,"接口异常,请稍后再试");
	}
	
}

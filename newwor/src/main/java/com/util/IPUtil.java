package com.util;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;

@Slf4j
public class IPUtil {
	public static String getIP(){
		InetAddress inetaddress = null;
		String IP = "";
		try {
			inetaddress = InetAddress.getLocalHost();
			// 获得本机IP
			IP = inetaddress.getHostAddress()+"" == null ? "获取IP失败" :inetaddress.getHostAddress() + "";
		} catch (UnknownHostException e) {
			log.error("获取IP失败", e);
		}
		return IP;
	}
	
	
	public static String getComputerName()throws Exception{
		InetAddress inetaddress = InetAddress.getLocalHost();
		// 获得本机名称　
		String ComputerName = inetaddress.getHostName().toString();
		return ComputerName;
	}
	
	/**
	 * 获取访问者IP
	 * 
	 * 在一般情况下使用Request.getRemoteAddr()即可，但是经过nginx等反向代理软件后，这个方法会失效。
	 * 
	 * 本方法先从Header中获取X-Real-IP，如果不存在再从X-Forwarded-For获得第一个IP(用,分割)，
	 * 如果还不存在则调用Request .getRemoteAddr()。
	 * 
	 * @param request
	 * @return
	 */
	public static String getIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("X-Real-IP");
		if (ip!=null && !"".equals(ip) && !"unknown".equalsIgnoreCase(ip)) {
			return ip;
		}
		ip = request.getHeader("X-Forwarded-For");
		if (ip!=null && !"".equals(ip) && !"unknown".equalsIgnoreCase(ip)) {
			// 多次反向代理后会有多个IP值，第一个为真实IP。
			int index = ip.indexOf(',');
			if (index != -1) {
				return ip.substring(0, index);
			} else {
				return ip;
			}
		} else {
			return request.getRemoteAddr();
		}
	}
}

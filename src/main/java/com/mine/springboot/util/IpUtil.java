/**
 * Project Name:zjbi
 * File Name:IpUtil.java
 * Package Name:com.handsure.zjbi.util
 * Date:2017年6月1日上午9:26:25
 * Copyright (c) 2017, 上海点贸信息计算有限公司版权所有.
 *
 */

package com.mine.springboot.util;

import javax.servlet.http.HttpServletRequest;

/**
 * ClassName: IpUtil
 * Function: TODO ADD FUNCTION.
 * date: 2017年6月1日 上午9:26:25
 *
 */
public class IpUtil {
	/**
	 * 
	 * 获取客户端ip地址.
	 *
	 * @author zhao rui
	 * @param request
	 * @return
	 */
	public static String getIpAddress(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_CLIENT_IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_X_FORWARDED_FOR");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}
}
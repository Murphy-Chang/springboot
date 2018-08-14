package com.mine.springboot.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Title:
 * Description:时间工具类
 * Copyright: Copyright (c) 2018
 *
 * @author Murphy.Chang
 * @version 1.0
 * @date 2018/6/12
 */
public class DateUtil {
	public static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	public static SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	/**
	 * Date-->yyyy-MM-dd HH:mm:ss
	 * @param date
	 * @return
	 */
	public static String formatDate1(Date date) {
		return dateTimeFormat.format(date);
	}

	/**
	 * yyyy-MM-dd HH:mm:ss-->Date
	 * @param dateStr
	 * @return
	 * @throws Exception
	 */
	public static Date parseDate1(String dateStr) {
		Date date = null;
		try {
			date = dateTimeFormat.parse(dateStr);
		}catch (Exception e){
			e.printStackTrace();
		}

		return date;
	}

	/**
	 * Date-->yyyy-MM-dd
	 * @param date
	 * @return
	 */
	public static String formatDate2(Date date) {
		return dateFormat.format(date);
	}

	/**
	 * yyyy-MM-dd-->Date
	 * @param dateStr
	 * @return
	 * @throws Exception
	 */
	public static Date parseDate2(String dateStr) {
		Date date = null;
		try {
			date = dateFormat.parse(dateStr);
		}catch (Exception e){
			e.printStackTrace();
		}

		return date;
	}
}

package com.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtil {
	public static String getCurrDateTime(String fmt) {
		SimpleDateFormat dateTimeFormatter = new SimpleDateFormat(fmt);
		return dateTimeFormatter.format(Calendar.getInstance().getTime());
	}
}

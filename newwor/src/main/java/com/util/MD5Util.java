package com.util;

import java.security.MessageDigest;

public class MD5Util {
	public static void main (String[] args) {
		String source = "666666";
		boolean uppercase = false;
		String encoding = "utf-8";
		String aaa = MD5Encode(source,encoding,uppercase);
		System.out.println(aaa);
	}

	private final static String[] hexDigits = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};//

	/**
	 * @param  source
	 *          需要加密的原字符串
	 * @param encoding
	 *          指定编码类型
	 * @param uppercase
	 *          是否转为大写字符串
	 * @return
	 */
	public static String MD5Encode(String source, String encoding, boolean uppercase){
		String result = null;
		try{
			result = source;
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.update(result.getBytes(encoding));
			result = byteArrayToHexString(messageDigest.digest());
		}catch (Exception e){
			e.printStackTrace();
		}

		System.out.println(result);

		return uppercase ? result.toUpperCase() : result;
	}

	/**
	 *转换字节数组为16进制字符串
	 * @param bytes
	 *          字节数组
	 *@return
	 */
	private static String byteArrayToHexString(byte[] bytes){
		StringBuilder stringBuilder = new StringBuilder();
		for(byte tem : bytes){
			stringBuilder.append(byteToHexString(tem));
		}

		return stringBuilder.toString();
	}

	/**
	 * 转换byte到16进制
	 * @param b
	 *              要转换的byte
	 * @return    16进制对应的字符
	 */
	private static String byteToHexString(byte b){
		int n = b;
		if(n<0){
			n = 256 + n ;
		}
		int d1 = n/16;
		int d2 = n%16;
		return  hexDigits[d1]+hexDigits[d2];
	}


}

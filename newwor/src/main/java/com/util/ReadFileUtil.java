package com.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Component
public class ReadFileUtil {

	/**
	 * 读文件（适用于格式  key=value ,每行格式相同）
	 *
	 * @param filePath 文件路径
	 * @return Map
	 * @throws Exception
	 */
	public static Map getValue(String filePath){
		Map<String, Object> resultMap = new HashMap<>();
		File file = new File(filePath);
		BufferedReader bf = null;
		try {
			bf = new BufferedReader(new FileReader(file));
			String line = "";
			while ((line = bf.readLine()) != null){
				String[] str = line.split("=");
				if (str.length == 2){
					resultMap.put(str[0], str[1]);
				}
			}
			return resultMap;
		}catch (Exception e){
			log.error("读取文件异常", e);
			return resultMap;
		}finally {
			try{
				if (bf != null){
					bf.close();
				}
			}catch (Exception e){
				log.error("关闭IO流异常", e);
			}
		}
	}

}

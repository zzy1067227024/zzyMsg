package com.util;
import com.alibaba.fastjson.JSONObject;
import com.hikvision.artemis.sdk.ArtemisHttpUtil;
import com.hikvision.artemis.sdk.config.ArtemisConfig;
import org.springframework.beans.factory.annotation.Value;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HkUtil {
    @Value("${HKhost}")
    private static String HKhost;
    @Value("${HKappKey}")
    private static String HKappKey;
    @Value("${HKappSecret}")
    private static String HKappSecret;

    public static String GetCameraPreviewURL(Map param,String pathUrl) {

       // com.arte.rws.util.VerintHttpUtil vr=new com.arte.rws.util.VerintHttpUtil();
        /**
         * STEP1：设置平台参数，根据实际情况,设置host appkey appsecret 三个参数.
         */
        ArtemisConfig.host = HKhost; // 平台的ip端口
        ArtemisConfig.appKey = HKappKey;  // 密钥appkey
        ArtemisConfig.appSecret = HKappSecret;// 密钥appSecret

        /**
         * STEP2：设置OpenAPI接口的上下文
         */
        final String ARTEMIS_PATH = "/artemis";
        //final String ARTEMIS_PATH = "https://10.157.72.73:83/artemis";

        /**
         * STEP3：设置接口的URI地址
         */
        final String previewURLsApi = ARTEMIS_PATH + pathUrl;
        Map<String, String> path = new HashMap<String, String>(2) {
            {
                put("https://", previewURLsApi);//根据现场环境部署确认是http还是https
            }
        };

        /**
         * STEP4：设置参数提交方式
         */
        String contentType = "application/json";

        /**
         * STEP5：组装请求参数
         */
        JSONObject jsonBody = new JSONObject();
        Set<Integer> keys = param.keySet();   //此行可省略，直接将map.keySet()写在for-each循环的条件中
        for(Integer key:keys){
            //System.out.println("key值："+key+" value值："+param.get(key));
            jsonBody.put(String.valueOf(key), String.valueOf(param.get(key)));
        }
//        jsonBody.put("pageNo", 1);
//        jsonBody.put("pageSize", 20);
//        jsonBody.put("treeCode", "0");
//        jsonBody.put("transmode", 1);
//        jsonBody.put("expand", "streamform=ps");
        String body = jsonBody.toJSONString();
        /**
         * STEP6：调用接口
         */
        String result = ArtemisHttpUtil.doPostStringArtemis(path, body, null, null, contentType , null);// post请求application/json类型参数
        return result;
    }


    public static void main(String[] args) {
        String result = "";//GetCameraPreviewURL();
        System.out.println("result结果示例: " + result);
    }
}

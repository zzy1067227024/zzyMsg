package com.util;

import com.alibaba.fastjson.JSONObject;
import com.hikvision.artemis.sdk.ArtemisHttpUtil;
import com.hikvision.artemis.sdk.config.ArtemisConfig;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
//import com.rabbitmq.client.QueueingConsumer;

import java.util.HashMap;
import java.util.Map;

//import com.rabbitmq.client.QueueingConsumer;
public class HkUtilOne {
//    @Value("${HKhost}")
//    private static String HKhost;
//    @Value("${HKappKey}")
//    private static String HKappKey;
//    @Value("${HKappSecret}")
//    private static String HKappSecret;

    private final static String QUEUE_NAME = "topic_queue_1";

    private final static String EXCHANGE_NAME = "topic_exchange";

//    public static String GetRabbitmq() {
//                try{
//        //1、获取连接
//        Connection connection = ConnectionUtil.getConnection("10.157.72.73",1883,"/","artemis_21154220_TAWGDN1N","4O6MD6X4");
//        //2、声明通道
//        Channel channel = connection.createChannel();
//        //3、声明队列
//        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
//        //4、绑定队列到交换机，指定路由key为update.#
//        channel.queueBind(QUEUE_NAME,EXCHANGE_NAME,"update.#");
//        //同一时刻服务器只会发送一条消息给消费者
//        channel.basicQos(1);
//        //5、定义队列的消费者
//        QueueingConsumer queueingConsumer = new QueueingConsumer(channel);
//        //6、监听队列,手动返回完成状态
//        channel.basicConsume(QUEUE_NAME,false,queueingConsumer);
//        //6、获取消息
//        while (true){
//            QueueingConsumer.Delivery delivery = queueingConsumer.nextDelivery();
//            String message = new String(delivery.getBody());
//            System.out.println(" 消费者1：" + message + "'");
//            //消费者1接收一条消息后休眠10毫秒
//            Thread.sleep(10);
//            //返回确认状态
//            channel.basicAck(delivery.getEnvelope().getDeliveryTag(),false);
//        }
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//                return "true";
//    }

//    public static String GetCameraPreviewURL() {
//
//        com.arte.rws.util.VerintHttpUtil vr=new com.arte.rws.util.VerintHttpUtil();
//        /**
//         * STEP1：设置平台参数，根据实际情况,设置host appkey appsecret 三个参数.
//         */
//        ArtemisConfig.host = "10.157.72.73:443"; // 平台的ip端口
//        ArtemisConfig.appKey = "21154220";  // 密钥appkey
//        ArtemisConfig.appSecret = "ZlIKrBLN7snIf1OkFiTz";// 密钥appSecret
//
//        /**
//         * STEP2：设置OpenAPI接口的上下文
//         */
//        final String ARTEMIS_PATH = "/artemis";
//        //final String ARTEMIS_PATH = "https://10.157.72.73:83/artemis";
//
//        /**
//         * STEP3：设置接口的URI地址
//         */
//        final String previewURLsApi = ARTEMIS_PATH + "/api/video/v1/cameras/previewURLs";
//        Map<String, String> path = new HashMap<String, String>(2) {
//            {
//                put("https://", previewURLsApi);//根据现场环境部署确认是http还是https
//            }
//        };
//
//        /**
//         * STEP4：设置参数提交方式
//         */
//        String contentType = "application/json";
//
//        /**
//         * STEP5：组装请求参数
//         */
//        JSONObject jsonBody = new JSONObject();
//       // String a[]={"3187675137"};
//     //  jsonBody.put("pageNo", 1);
//     //  jsonBody.put("pageSize", 20);
//      jsonBody.put("cameraIndexCode","1c8ada7b9c9640eaafcdc7780e0653c5");
//        jsonBody.put("streamType", "0");
//        jsonBody.put("protocol", "rtsp");
//        jsonBody.put("transmode", "0");
//        jsonBody.put("expand", "transcode=0");
//        //jsonBody.put("treeCode", "0");
//      //  jsonBody.put("eventTypes", a);
////        jsonBody.put("expand", "streamform=ps");
//        String body = jsonBody.toJSONString();
//        /**
//         * STEP6：调用接口
//         */
//        String result = ArtemisHttpUtil.doPostStringArtemis(path, body, null, null, contentType , null);// post请求application/json类型参数
//        return result;
//    }


    public static void main(String[] args) {
        //String result = GetCameraPreviewURL();
       // String result = GetRabbitmq();
        //System.out.println("result结果示例: " + result);
    }
}

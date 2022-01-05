package com.util;

import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;


public class VerintHttpUtil {
	// 管理系统日志
				//private static Logger logger = Logger.getLogger("coreUse");
			//	private static Logger loggerError = Logger.getLogger("coreError");
	public VerintHttpUtil() {
		// TODO Auto-generated constructor stub
	}

    public static String sendPost(String url,String param,String AuthToken){
        OutputStreamWriter out =null;
        BufferedReader reader = null;
        String response = "";

        //创建连接
        try {
            URL httpUrl = null; //HTTP URL类 用这个类来创建连接
            //创建URL
            httpUrl = new URL(url);
            //建立连接
            HttpURLConnection conn = (HttpURLConnection) httpUrl.openConnection();
            //String verintrecordip = ETPConfigs.getETPConfigs().getPropertyMessage("sysConfig", "verintrecordip");
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            //conn.setRequestProperty("connection", "keep-alive");
            //conn.setRequestProperty("Host", verintrecordip+":80");
            if(!"".equals(AuthToken)){
            	conn.setRequestProperty("Impact360AuthToken", AuthToken);	
            }
            conn.setRequestProperty("Content-Length",
                    String.valueOf(param.getBytes().length));
            
            conn.setUseCaches(false);//设置不要缓存
            conn.setInstanceFollowRedirects(true);
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.connect();
            //POST请求
            out = new OutputStreamWriter(
                    conn.getOutputStream());
            out.write(param);
            out.flush();
            //读取响应
            reader = new BufferedReader(new InputStreamReader(
                    conn.getInputStream()));
            String lines;
            while ((lines = reader.readLine()) != null) {
                lines = new String(lines.getBytes(), "utf-8");
                response+=lines;
            }
            reader.close();
            // 断开连接
            conn.disconnect();

        } catch (Exception e) {
            //System.out.println("发送 POST 请求出现异常！"+e);
        	//loggerError.info("->发送 POST 请求出现异常！"+AuthToken, e);
            e.printStackTrace();
        }
        //使用finally块来关闭输出流、输入流
        finally{
            try{
                if(out!=null){
                    out.close();
                }
                if(reader!=null){
                    reader.close();
                }
            }
            catch(IOException ex){
                ex.printStackTrace();
//                loggerError.info("->发送 POST 请求出现异常！"+AuthToken, ex);
            }
        }
       // logger.info("请求录音服务结果==="+response);
        return response;
    }
    
    
    
 // 调用WS
    public static StringBuffer WebService(String wsurl,String sid, String siteid,  String audiostarttime,String AuthToken,String type) throws Exception {
    	
        //拼接请求报文
        String sendMsg = appendXmlContext(sid, siteid, audiostarttime,type);
        // 开启HTTP连接ַ
        InputStreamReader isr = null;
        BufferedReader inReader = null;
        StringBuffer result = null;
        OutputStream outObject = null;
        try {
            URL url = new URL(wsurl);
            HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
 
            // 设置HTTP请求相关信息
            httpConn.setRequestProperty("Content-Length",
                    String.valueOf(sendMsg.getBytes().length));
            httpConn.setRequestProperty("Content-Type", "application/soap+xml; charset=utf-8");
            httpConn.setRequestProperty("Impact360AuthToken", AuthToken);
            httpConn.setRequestMethod("POST");
            httpConn.setDoOutput(true);
            httpConn.setDoInput(true);
 
            // 进行HTTP请求
            outObject = httpConn.getOutputStream();
            outObject.write(sendMsg.getBytes());
 
            if (200 != (httpConn.getResponseCode())) {
                throw new Exception("HTTP Request is not success, Response code is " + httpConn.getResponseCode());
            }
            // 获取HTTP响应数据
            isr = new InputStreamReader(
                    httpConn.getInputStream(), "utf-8");
            inReader = new BufferedReader(isr);
            result = new StringBuffer();
            String inputLine;
            while ((inputLine = inReader.readLine()) != null) {
                result.append(inputLine);
            }
 
        } catch (IOException e) {
        	 e.printStackTrace();
        	 //loggerError.info("请求录音服务结果===", e);
        } finally {
            // 关闭输入流
            if (inReader != null) {
                inReader.close();
            }
            if (isr != null) {
                isr.close();
            }
            // 关闭输出流
            if (outObject != null) {
                outObject.close();
            }
        }
		return result;
 
    }
 
    //拼接请求报文
    private static String appendXmlContext(String sid, String siteid, String audiostarttime,String type) {
    	String MediaDescription ="";
    	String portable ="";
    	String returnmsg ="";
    	if("1".equals(type)){
    		MediaDescription ="AudioMediaDescription";
    		portable ="portable";
    	}else if("2".equals(type)){
    		MediaDescription ="ScreenMediaDescription";
    		portable ="portable";
    	}else if("3".equals(type)){
    		MediaDescription ="AudioScreenMediaDescription";
    	}
        // 构建请求报文
    	StringBuffer stringBuffer = new StringBuffer("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
    		"<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n" +
    	    "<soap12:Body>\n" +
    	    "<GetMediaFilesWithSessionDetails xmlns=\"http://tempuri.org/\">\n" +
    	    "<details>\n" +
    	    "<SessionDetails>\n" +
    	    "<siteId>"+siteid+"</siteId>\n" +
    	    "<sessionId>"+sid+"</sessionId>\n" +
    	    "<StartTime>"+audiostarttime+"</StartTime>\n" +
    	    "</SessionDetails>\n" +
    	    "</details>\n" +
    	    "<mediaDescriptions>\n" +
    	    "<MediaDescription xsi:type=\""+MediaDescription+"\">\n" +
    	    "<Decrypt>0</Decrypt>\n" +
    	    "<Format>"+portable+"</Format>\n" +
    	    "</MediaDescription>\n" +
    	    "</mediaDescriptions>\n" +
    	    "<modifiers>\n" +
    	    "<PlaybackSiteIds>\n" +
    	    "<string>"+siteid+"</string>\n" +
    	    "</PlaybackSiteIds>\n" +
    	    "<Streaming>0</Streaming>\n" +
    	    "</modifiers>\n" +
    	    "</GetMediaFilesWithSessionDetails>\n" +
    	    "</soap12:Body>\n" +
                "</soap12:Envelope>");
    	
    	 // 构建请求报文
    	StringBuffer stringBufferb = new StringBuffer("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
    		"<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n" +
    	    "<soap12:Body>\n" +
    	    "<GetMediaFilesWithSessionDetails xmlns=\"http://tempuri.org/\">\n" +
    	    "<details>\n" +
    	    "<SessionDetails>\n" +
    	    "<siteId>"+siteid+"</siteId>\n" +
    	    "<sessionId>"+sid+"</sessionId>\n" +
    	    "<StartTime>"+audiostarttime+"</StartTime>\n" +
    	    "</SessionDetails>\n" +
    	    "</details>\n" +
    	    "<mediaDescriptions>\n" +
    	    "<MediaDescription xsi:type=\"AudioMediaDescription\">\n" +
    	    "<Decrypt>0</Decrypt>\n" +
    	    "<Format>portable</Format>\n" +
    	    "</MediaDescription>\n" +
    	    "<MediaDescription xsi:type=\"ScreenMediaDescription\">\n" +
    	    "<Decrypt>0</Decrypt>\n" +
    	    "<Format>portable</Format>\n" +
    	    "</MediaDescription>\n" +
    	    "</mediaDescriptions>\n" +
    	    "<modifiers>\n" +
    	    "<PlaybackSiteIds>\n" +
    	    "<string>"+siteid+"</string>\n" +
    	    "</PlaybackSiteIds>\n" +
    	    "<Streaming>0</Streaming>\n" +
    	    "</modifiers>\n" +
    	    "</GetMediaFilesWithSessionDetails>\n" +
    	    "</soap12:Body>\n" +
                "</soap12:Envelope>");
    	
    	if("4".equals(type)){
    		returnmsg =stringBufferb.toString();
    	}else{
    		returnmsg =stringBuffer.toString();
    	}
    	//logger.info("请求录音服务结果==="+returnmsg);
        return returnmsg;
    }
 
    

	
	
	
	public static void main(String [] args){
		String httpUrl ="http://158.58.20.93:5070/EtpAgServer";
		/*String src = "user="+"wsuperuser";
		src += "&password=" + "pumpkin1"; */
		//String src ="\"{\"user\":\"wsuperuser\",\"password\":\"pumpkin1\"}\"";
		JSONObject jsonParam = new JSONObject();
        jsonParam.put("user", "wsuperuser");
        jsonParam.put("password", "pumpkin1");
        String src = jsonParam.toString();
		try {
			String token ="";
			String AuthToken ="";
			token =sendPost(httpUrl, src,"");
			/*if(token!=null){
				JSONObject jo  =new JSONObject(token);
				AuthToken =jo.getJSONObject("AuthToken").getString("token");
				String getVoiceUrl ="http://197.68.79.141/DASWebAPI/Query/ExecuteDynamicQuery";
				JSONObject getVoice = new JSONObject();
				getVoice.put("UserID", "8001");
				getVoice.put("ConditionsString", "SWITCH_CALL_ID=00571011811594882175");
				getVoice.put("RequestedColumns", "");
				getVoice.put("CommandTimoutSeconds", "60");
				HashMap<String, String> period = new HashMap<String, String>();// 关联map
				String BeginPeriod =DateUtil.getbeforeyear(-10);
				String EndPeriod =DateUtil.getCurrentDate();
				period.put("BeginPeriod", BeginPeriod+"T00:00:00");
				period.put("EndPeriod", EndPeriod+"T23:59:59");
				period.put("TimeOfDateBegin", "00:00:00");
				period.put("TimeOfDateEnd", "23:59:59");
				period.put("Type", "Absolute");
				period.put("Days", DateUtil.daysOfTwo(BeginPeriod, EndPeriod));
				getVoice.put("period", period);
				String getSid =sendPost(getVoiceUrl, getVoice.toString(),AuthToken);
				JSONObject josid  =new JSONObject(getSid);
				JSONArray ja =josid.getJSONArray("Sessions");
				int sid =ja.getJSONObject(0).getInt("sid");
				int siteid =ja.getJSONObject(0).getInt("site_id");
				String audiostarttime =ja.getJSONObject(0).getString("AUDIO_START_TIME");
				System.out.println(ja.getJSONObject(0).getInt("sid"));
				System.out.println(ja.getJSONObject(0).getInt("site_id"));
				String invoicewsurl = "http://197.68.79.141/das101/mediautilizationapiwebservice.asmx";
				String returnvoice =WebService(invoicewsurl,Integer.toString(sid), Integer.toString(siteid),audiostarttime,AuthToken,"1").toString();
				String returnvideo =WebService(invoicewsurl,Integer.toString(sid), Integer.toString(siteid),audiostarttime,AuthToken,"2").toString();
				String returnvideoandvoice =WebService(invoicewsurl,Integer.toString(sid), Integer.toString(siteid),audiostarttime,AuthToken,"3").toString();
				System.out.println("录频：returnvideoandvoice==="+returnvideoandvoice);
				//String voicePath =getXmlMessageByName(returnvoice, "MediaItems");
				AnalysisSoap as =new AnalysisSoap();
				Map map = as.parse(returnvoice);
				Map map1 = as.parse(returnvideo);
				Map map2 = as.parse(returnvideoandvoice);
				//获得字段s:SourceSysId的值;
				String voicePath = map.get("HttpPath").toString();
				String videoPath = map1.get("HttpPath").toString();
				String videoandvoicePath = map2.get("HttpPath").toString();
				System.out.println("录音：voicePath==="+voicePath);
				System.out.println("录频：videoPath==="+videoPath);
				System.out.println("录频：videoandvoicePath==="+videoandvoicePath);
			}*/
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//loggerError.info("获取录屏结果===", e);
		}
		
	}
	
	
	
	

}

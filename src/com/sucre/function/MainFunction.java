package com.sucre.function;

import java.net.CookieHandler;

import com.sucre.mainUtil.MyUtil;
import com.sucre.mainUtil.SinaUtils;
import com.sucre.myNet.Nets;
import com.sucre.myThread.Thread4Net;

public class MainFunction extends Thread4Net{

	protected MainFunction(int u, boolean isCircle) {
		super(u, isCircle);
		
	}

	@Override
	public int doWork(int index) {
		Nets nets= new Nets();
		String ret="";
		
		
		
		return index;
	}
	
    private byte[] score(String cookie) {
		StringBuilder data = new StringBuilder(900);
		String temp = "type=REQUEST&user_score=0\r\n";
		
		data.append("POST https://huati.weibo.cn/aj/super/receivescore HTTP/1.1\r\n");
		data.append("Host: huati.weibo.cn\r\n");
		data.append("Connection: keep-alive\r\n");
		data.append("Content-Length: "+ temp +"\r\n");
		data.append("Accept: application/json, text/plain, */*\r\n");
		data.append("Origin: https://huati.weibo.cn\r\n");
		data.append("X-Requested-With: XMLHttpRequest\r\n");
		data.append("x-wap-profile: http://wap1.huawei.com/uaprof/HONOR_Che2-TL00_UAProfile.xml\r\n");
		data.append("User-Agent: Mozilla/5.0 (Linux; Android 4.4.2; Che2-TL00 Build/HonorChe2-TL00) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/30.0.0.0 Mobile Safari/537.36 Weibo (HUAWEI-Che2-TL00__weibo__8.6.3__android__android4.4.2)\r\n");
		data.append("Content-Type: application/x-www-form-urlencoded\r\n");
		data.append("Referer: https://huati.weibo.cn/super/taskcenter?ua=HUAWEI-Che2-TL00__weibo__8.6.3__android__android4.4.2&from=1086395010\r\n");
		data.append("Accept-Language: zh-CN,en-US;q=0.8\r\n");
		data.append("Cookie: "+ cookie +"\r\n");
		data.append("\r\n");
		data.append(temp);
		data.append("\r\n");
		data.append("\r\n");
		
		return data.toString().getBytes();
	}
    private byte[] follow(String cookie,String uid,String vid) {
    	
		StringBuilder data = new StringBuilder(900);
		String temp = "";
		cookie=MyUtil.trimNull(cookie);
		uid=MyUtil.trimNull(uid);
		vid=MyUtil.trimNull(vid);
		
		
		data.append("GET https://api.weibo.cn/2/friendships_pages/create?networktype=wifi&extparam=tabbar_follow%234296204685089364&cardid=1008080013_0&able_recommend=0&uicode=10000011&moduleID=700&wb_version=3654&c=android&i=f842b7a&s="+ SinaUtils.CaculateS(uid) +"&ft=0&id=1022%3A10080817c0fee819b9c79696a382f9634dbd87&ua=HUAWEI-Che2-TL00__weibo__8.6.3__android__android4.4.2&wm=9006_2001&aid=01Anlv2XwdpcqURzkYptXmiLgF3XZdgmTqaHowQEvwWF5xAFc.&fid=10080817c0fee819b9c79696a382f9634dbd87&v_f=2&v_p=62&from=1086395010&gsid="+ cookie +"&lang=zh_CN&lfid=100803_-_recentvisit&skin=default&oldwm=9006_2001&sflag=1&cum=AFE0892D HTTP/1.1\r\n");
		data.append("Host: api.weibo.cn\r\n");
		data.append("Connection: keep-alive\r\n");
		data.append("X-Sessionid: 4a7f855c-2177-4edf-8932-9f24f7ab044b\r\n");
		data.append("X-Validator: qJAP41mNoIR0BCOfORW1xUqpRwIp4ZzBpuAEdfnXwl8=\r\n");
		data.append("X-Log-Uid: "+ uid +"\r\n");
		data.append("User-Agent: Che2-TL00_4.4.2_weibo_8.6.3_android\r\n");
		data.append("\r\n");
		data.append("\r\n");
		return data.toString().getBytes();
	}
    private byte[] checkin(String cookie,String uid ,String vid ) {
		StringBuilder data = new StringBuilder(900);
		data.append("GET https://api.weibo.cn/2/page/button?request_url=http%3A%2F%2Fi.huati.weibo.com%2Fmobile%2Fsuper%2Factive_checkin%3Fpageid%3D10080817c0fee819b9c79696a382f9634dbd87&networktype=wifi&extparam=tabbar_follow%234296204685089364&accuracy_level=0&uicode=10000011&moduleID=700&wb_version=3654&c=android&i=f842b7a&s="+ SinaUtils.CaculateS(uid) +"&ft=0&ua=HUAWEI-Che2-TL00__weibo__8.6.3__android__android4.4.2&wm=9006_2001&aid=01Anlv2XwdpcqURzkYptXmiLgF3XZdgmTqaHowQEvwWF5xAFc.&fid=10080817c0fee819b9c79696a382f9634dbd87&v_f=2&v_p=62&from=1086395010&gsid="+ cookie +"&lang=zh_CN&lfid=100803_-_recentvisit&skin=default&oldwm=9006_2001&sflag=1&cum=E0214B2C HTTP/1.1\r\n");
		data.append("Host: api.weibo.cn\r\n");
		data.append("Connection: keep-alive\r\n");
		data.append("X-Sessionid: 254d6771-e273-4459-a1f6-16ded81e4c68\r\n");
		data.append("X-Validator: dCVMGLasu0eSgtHMYLonQCrDupmj9d5RNY1sosXJWc8=\r\n");
		data.append("X-Log-Uid: "+ uid +"\r\n");
		data.append("User-Agent: Che2-TL00_4.4.2_weibo_8.6.3_android\r\n");
		data.append("\r\n");
		data.append("\r\n");
		return data.toString().getBytes();
	}
}

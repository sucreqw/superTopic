package com.sucre.function;

import java.net.CookieHandler;

import com.sucre.myThread.Thread4Net;

public class MainFunction extends Thread4Net{

	protected MainFunction(int u, boolean isCircle) {
		super(u, isCircle);
		
	}

	@Override
	public int doWork(int index) {
		
		return 0;
	}
	
    private byte[] getdata(String cookie) {
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
}

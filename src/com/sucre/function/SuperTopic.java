package com.sucre.function;

import com.sucre.mainUtil.Info;
import com.sucre.mainUtil.MyUtil;
import com.sucre.properties.accounts;

public class SuperTopic {
	public static void main(String[] args) {
		int threadNum = Integer.parseInt(args.length != 0 && !"".equals(args[0]) ? args[0] : "1");
	    load();
		System.out.println("开始任务。线程数量："+ threadNum);
		MainFunction m = new MainFunction(1, false);
		for (int i = 0; i < threadNum; i++) {
			
			Thread thread = new Thread(m);
			if(i==0) {thread.setName("ip");}
			thread.start();
		}
	}
	
	public static void load() {
		try {
		Info info=accounts.getInstance();
		MyUtil.loadADSL("adsl.properties",accounts.getInstance());
		System.out.println(info.getADSL() +"<>" + info.getADSLname() +"<>" + info.getADSLpass());
		MyUtil.loadList("cookie.txt", MyUtil.listCookie);
		System.out.println("导入cookie数量：" + MyUtil.listCookie.getSize());
		
		}catch (Exception e) {
			System.out.println("导入文件出错：" + e.getMessage());
		}
		
	}
}

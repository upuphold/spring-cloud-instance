package com.uuh.viewservicefeign.util;

import cn.hutool.http.HttpUtil;

import java.util.HashMap;

/**
 * @Description:
 * @Date: 2019年07月23日 15:20
 * @Author: ChenGang
 * @Version: 1.0
 */
public class FreshConfigUtil {

	public static void main(String[] args) {
		HashMap<String,String> headers =new HashMap<>();
		headers.put("Content-Type", "application/json; charset=utf-8");
		System.out.println("因为要去git获取，还要刷新config-server, 会比较卡，所以一般会要好几秒才能完成，请耐心等待");

		String result = HttpUtil.createPost("http://localhost:8012/actuator/bus-refresh").addHeaders(headers).execute().body();
		System.out.println("result:"+result);
		System.out.println("refresh 完成");
	}
}
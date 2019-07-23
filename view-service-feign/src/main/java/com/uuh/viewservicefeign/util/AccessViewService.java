package com.uuh.viewservicefeign.util;

import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.http.HttpUtil;

/**
 * Description:
 * Date: 2019年07月24日 0:27
 * Author: cg
 * Version: 1.0
 */
public class AccessViewService {
	public static void main(String[] args) {
		while(true) {
			ThreadUtil.sleep(1000);
			try {
				String html= HttpUtil.get("http://127.0.0.1:9001/products");
				System.out.println("html length:" + html.length());
			}
			catch(Exception e) {
				System.err.println(e.getMessage());
			}

		}
	}
}

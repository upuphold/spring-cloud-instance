package com.uuh.dataservice.service;

import com.uuh.dataservice.entity.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 商品服务类
 * Date: 2019年07月22日 0:58
 * Author: cg
 * Version: 1.0
 */
@Service
public class ProductService {

	@Value("${server.port}")
	private String port;

	public List<Product> products() {
		List<Product> ps = new ArrayList<>();
		ps.add(new Product(1, "product a from port:" + port, 50));
		ps.add(new Product(2, "product b from port:" + port, 150));
		ps.add(new Product(3, "product c from port:" + port, 250));
		return ps;
	}
}

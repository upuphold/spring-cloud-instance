package com.uuh.dataservice.controller;

import com.uuh.dataservice.entity.Product;
import com.uuh.dataservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description: 商品服务控制类
 * Date: 2019年07月22日 1:01
 * Author: cg
 * Version: 1.0
 */
@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping("/products")
	public Object products() {
		List<Product> products = productService.products();
		return products;
	}
}

package com.uuh.viewserviceribbon.controller;

import com.uuh.viewserviceribbon.entity.Product;
import com.uuh.viewserviceribbon.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Description:
 * Date: 2019年07月22日 1:53
 * Author: cg
 * Version: 1.0
 */
@Controller
public class ProductController {

	@Autowired
	ProductService productService;

	@RequestMapping("/products")
	public Object products(Model m) {
		List<Product> ps = productService.products();
		m.addAttribute("ps", ps);
		return "products";
	}
}
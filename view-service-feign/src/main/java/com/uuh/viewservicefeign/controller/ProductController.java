package com.uuh.viewservicefeign.controller;

import com.uuh.viewservicefeign.entity.Product;
import com.uuh.viewservicefeign.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Description:
 * @Date: 2019年07月22日 13:41
 * @Author: ChenGang
 * @Version: 1.0
 */
@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@Value("${version}")
	String version;


	@RequestMapping("/products")
	public Object products(Model model) {
		List<Product> products = productService.products();
		model.addAttribute("ps", products);
		model.addAttribute("version", version);
		return model;
	}
}

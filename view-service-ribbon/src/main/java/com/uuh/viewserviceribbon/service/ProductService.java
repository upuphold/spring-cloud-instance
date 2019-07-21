package com.uuh.viewserviceribbon.service;

import com.uuh.viewserviceribbon.client.ProductClientRibbon;
import com.uuh.viewserviceribbon.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 * Date: 2019年07月22日 1:52
 * Author: cg
 * Version: 1.0
 */
@Service
public class ProductService {
	@Autowired
	private ProductClientRibbon productClientRibbon;
	public List<Product> products(){
		return productClientRibbon.products();

	}
}
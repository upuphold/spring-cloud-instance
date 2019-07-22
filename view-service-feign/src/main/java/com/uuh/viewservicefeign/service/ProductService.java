package com.uuh.viewservicefeign.service;

import com.uuh.viewservicefeign.client.ProductClientFeign;
import com.uuh.viewservicefeign.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Date: 2019年07月22日 13:38
 * @Author: ChenGang
 * @Version: 1.0
 */
@Service
public class ProductService {

	@Autowired
	private ProductClientFeign productClientFeign;

	public List<Product> products(){
		return productClientFeign.products();
	}
}

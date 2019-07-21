package com.uuh.viewserviceribbon.client;

import com.uuh.viewserviceribbon.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Description: 视图ribbon客户端
 * Date: 2019年07月22日 1:48
 * Author: cg
 * Version: 1.0
 */
@Component
public class ProductClientRibbon {

	@Autowired
	private RestTemplate restTemplate;

	public List<Product> products(){
		return restTemplate.getForObject("http://DATA-SERVICE/products",List.class);
	}
}

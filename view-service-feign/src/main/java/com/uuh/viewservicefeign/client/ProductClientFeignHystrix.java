package com.uuh.viewservicefeign.client;

import com.uuh.viewservicefeign.entity.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 断路器
 * Date: 2019年07月23日 21:55
 * Author: cg
 * Version: 1.0
 */
@Component
public class ProductClientFeignHystrix implements ProductClientFeign{
	@Override
	public List<Product> products() {
		List<Product> products=new ArrayList<>();
		products.add(new Product(0,"商品数据服务不可用",0));
		return products;
	}
}

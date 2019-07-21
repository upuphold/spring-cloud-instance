package com.uuh.dataservice.entity;

import lombok.Data;

/**
 * Description: 商品实体类
 * Date: 2019年07月22日 0:56
 * Author: cg
 * Version: 1.0
 */
@Data
public class Product {

	private Integer id;

	private String name;

	private Integer price;

	public Product() {
	}

	public Product(Integer id, String name, Integer price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

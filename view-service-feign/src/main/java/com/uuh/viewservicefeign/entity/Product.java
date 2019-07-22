package com.uuh.viewservicefeign.entity;

import lombok.Data;

/**
 * Description: 商品实体类
 * Date: 2019年07月22日 1:50
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

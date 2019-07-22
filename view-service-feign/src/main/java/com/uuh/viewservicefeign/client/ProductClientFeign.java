package com.uuh.viewservicefeign.client;

import com.uuh.viewservicefeign.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author cg
 */
@FeignClient(value = "DATA-SERVICE")
public interface ProductClientFeign {

	/**
	 * @return
	 */
	@GetMapping("/products")
	public List<Product> products();

}

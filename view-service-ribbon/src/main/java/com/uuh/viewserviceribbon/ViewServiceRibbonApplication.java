package com.uuh.viewserviceribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


/*EnableDiscoveryClient用于发现注册中心*/
/*RestTemplate用来做负载均衡*/

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ViewServiceRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViewServiceRibbonApplication.class, args);
	}

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}



}

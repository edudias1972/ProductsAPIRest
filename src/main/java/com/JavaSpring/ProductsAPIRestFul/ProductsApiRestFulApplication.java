package com.JavaSpring.ProductsAPIRestFul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.JavaSpring.ProductsAPIRestFul.models")
public class ProductsApiRestFulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsApiRestFulApplication.class, args);
	}

}

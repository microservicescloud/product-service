package com.cs.ps.controller;

import com.cs.ps.model.ConfigPros;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/")
@RefreshScope
public class ProductController {

	private final ConfigPros pros;

	public ProductController(ConfigPros pros) {
		this.pros = pros;
	}

	@Value("${message:Product default}")
	private String message;

	@RequestMapping("/{product}")
	public String getProduct(@PathVariable("product") String product) {
		return "product id: "+product;
	}

	@RequestMapping("/")
	public String test() {
		return "hello em yeu:" + message;
	}

}
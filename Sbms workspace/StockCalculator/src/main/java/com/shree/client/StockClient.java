package com.shree.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://localhost:1111",name = "STOCK-PRICE")
public interface StockClient {
	@GetMapping("/stockprice/{name}")
	public Double stockprice(@PathVariable("name") String companyName);

}

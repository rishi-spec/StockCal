package com.shree.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.converters.Auto;
import com.shree.client.StockClient;

@RestController
public class StockCalculatorController {
	
	
	
	@Autowired
	private StockClient stockclient;
	
	@GetMapping("/calculate/{name}/{quantity}")
	public String calculate(@PathVariable("name") String companyName,
			                @PathVariable("quantity") Integer quantity) {
		
		
		double totalAmount;
		
		Double stockprice = stockclient.stockprice(companyName);
		
		totalAmount  = stockprice*quantity;
		
		String respone = "Total Amount\t" +totalAmount;
		
		
		
		
		return respone;
		
	}
	

}

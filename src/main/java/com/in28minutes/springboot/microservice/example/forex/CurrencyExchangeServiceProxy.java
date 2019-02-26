package com.in28minutes.springboot.microservice.example.forex;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="forex-service", url="localhost:8000")
public interface CurrencyExchangeServiceProxy { 
	@GetMapping("/currency-exchange/getList")
	  public List<ExchangeValue> getList();
	
  //  @GetMapping("/currency-exchange/fetchList")
   //  public void fetchList();
  
  
  
}
package com.in28minutes.springboot.microservice.example.forex;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;




@RestController
public class RouterService {
	
	 // @Autowired
	 // private CurrencyExchangeServiceProxy proxy;
	
	  @CrossOrigin(origins = *)
	  @GetMapping("/getExchangeRates")
	  public Object[] retrieveExchangeValue(){
	    
		 //proxy.fetchList(); 
        //List<ExchangeValue> response = proxy.getList();	
		  
		  System.out.println("HIIIIT");
		  
		/*  ResponseEntity<List<ExchangeValue>> responseEntity = new RestTemplate().exchange(
			        "http://localhost:8000/currency-exchange/getList",  HttpMethod.GET, null, new ParameterizedTypeReference<List<ExchangeValue>>() {
		            });*/
		  
		  
			  ResponseEntity<Object[]> responseEntity = new RestTemplate().exchange(
	        "http://forex-service.kursna-lista.svc:8080/currency-exchange/getList",  HttpMethod.GET, null, new ParameterizedTypeReference<Object[]>() {
          });
		 
			  Object[] response =  responseEntity.getBody();
		  
	    System.out.println("Rez:"+response.toString());
	    return response;
	    
	    
	  }

}

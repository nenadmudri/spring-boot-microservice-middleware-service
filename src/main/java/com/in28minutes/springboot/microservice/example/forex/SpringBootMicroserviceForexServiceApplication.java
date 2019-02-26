package com.in28minutes.springboot.microservice.example.forex;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.event.EventListener;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

@SpringBootApplication
@EnableFeignClients("microservice.example.currencyconversion")
public class SpringBootMicroserviceForexServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroserviceForexServiceApplication.class, args);
	}
	
	
	}




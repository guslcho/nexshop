package com.sds.nextshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class NexshopZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NexshopZuulServerApplication.class, args);
	}
}

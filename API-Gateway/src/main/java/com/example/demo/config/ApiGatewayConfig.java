package com.example.demo.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import reactor.core.publisher.Mono;

@Configuration
public class ApiGatewayConfig {
	
	@Bean
	public KeyResolver ipKeyResolver(){
		return exchange -> {
			String ip = exchange.getRequest()
								.getRemoteAddress()
								.getAddress()
								.getHostAddress();
			System.out.println("Request from IP : " + ip);
			return Mono.just(ip);
		};
	}

}

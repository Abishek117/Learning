package com.learning;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class LearnKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnKafkaApplication.class, args);
	}
//	@Bean
//	CommandLineRunner cmdRunner(KafkaTemplate<String, String> kafkaTemplate) {
//		return args -> {
//			kafkaTemplate.send("TestTopic1","hello world :)");
//		};
//	}

}

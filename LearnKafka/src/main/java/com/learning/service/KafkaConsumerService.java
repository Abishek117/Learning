package com.learning.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "TestTopic1", groupId = "${spring.kafka.consumer.group-id}")
    public void consumeMessage(String message){
        System.out.println("Consumed  message: " + message);
    }
}

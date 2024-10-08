package com.learning.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic kafkaTopic1(){
        return TopicBuilder
                .name("TestTopic1")
                .build();
    }

    @Bean
    public NewTopic kafkaTopic2(){
        return TopicBuilder
                .name("TestTopic2")
                .build();
    }
}

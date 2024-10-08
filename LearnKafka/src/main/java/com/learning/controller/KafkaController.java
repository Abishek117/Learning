package com.learning.controller;

import com.learning.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class KafkaController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @PostMapping("/postMessage")
    public String publishMessage(@RequestBody String msgReq) {
        kafkaProducerService.sendMessage( msgReq);
        return "Message sent Successfully";
    }
}

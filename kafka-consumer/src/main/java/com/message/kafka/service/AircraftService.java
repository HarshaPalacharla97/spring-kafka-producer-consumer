package com.message.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.message.kafka.dto.Aircraft;

@Service
public class AircraftService {

    private String consumedMessage;

    @KafkaListener(topics = "aircraft-topic", groupId = "aircraft-consumer-group")
    public void consumeKafkaTopic(Aircraft aircraft){
        consumedMessage = aircraft+" received from kafka topic";
        System.out.println(consumedMessage);
    }

    public String getMessage() {
        return consumedMessage;
    }

}

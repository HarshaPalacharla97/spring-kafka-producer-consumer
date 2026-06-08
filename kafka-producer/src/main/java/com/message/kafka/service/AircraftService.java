package com.message.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.message.kafka.dto.Aircraft;

@Service
public class AircraftService {

    @Autowired
    private KafkaTemplate<String, Aircraft> kafkaTemplate;

    public String sendAircraftMessageToKafka(Aircraft aircraft){
        kafkaTemplate.send("aircraft-topic", "aircrat-partition-01", aircraft);
        return "Kafka Message sent Successfully to aircraft-topic-01";
    }
    
}

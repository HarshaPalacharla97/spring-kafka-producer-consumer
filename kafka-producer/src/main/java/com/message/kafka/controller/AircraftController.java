package com.message.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.message.kafka.dto.Aircraft;
import com.message.kafka.service.AircraftService;

@RestController
@RequestMapping("/kafka-producer/aircraft")
public class AircraftController {

    @Autowired
    private AircraftService aircraftService;

    @PostMapping("/send-kafka-message")
    public ResponseEntity<String> sendAircraftMessage(@RequestBody Aircraft aircraft){
        String response =aircraftService.sendAircraftMessageToKafka(aircraft);
        return ResponseEntity.ok(response);
    }
    
}

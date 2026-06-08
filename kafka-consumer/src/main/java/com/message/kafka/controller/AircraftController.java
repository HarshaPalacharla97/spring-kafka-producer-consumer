package com.message.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.message.kafka.service.AircraftService;

@RestController
@RequestMapping("/kafka-consumer/aircraft")
public class AircraftController {

    @Autowired
    private AircraftService aircraftService;

    @GetMapping("/consume-kafka-message")
    public ResponseEntity<String> consumeMessage(){
        String response = aircraftService.getMessage();
        return ResponseEntity.ok(response);
    }


    
}

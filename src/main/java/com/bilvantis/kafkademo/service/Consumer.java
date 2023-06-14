package com.bilvantis.kafkademo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "demo_topic", groupId = "demo_group")
    public void listenToTopic(String receivedMessage) {
        System.out.println("The message received is ::::: " + receivedMessage);
    }

}

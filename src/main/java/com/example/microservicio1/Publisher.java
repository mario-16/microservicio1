package com.example.microservicio1;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Publisher {

//    @Autowired
//    private RabbitTemplate rabbitTemplate;
//
//    public void sendMessage(String exchange, String routingKey, Object message) {
//        rabbitTemplate.convertAndSend(exchange, routingKey, message);
//    }

}

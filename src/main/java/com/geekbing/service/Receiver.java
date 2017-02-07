package com.geekbing.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: bing
 * Date: 2017-02-07 13:08
 * Email: dhuzbb@163.com
 */
@Service
public class Receiver {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    @RabbitListener(queues = "spring-boot-simple")
    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
    }
}

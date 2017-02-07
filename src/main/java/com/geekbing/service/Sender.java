package com.geekbing.service;

import com.geekbing.config.RabbitMQConfig2;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: bing
 * Date: 2017-02-07 13:07
 * Email: dhuzbb@163.com
 */
@Service
public class Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        System.out.println("梁桂钊 发送消息...");
        rabbitTemplate.convertAndSend(RabbitMQConfig2.QUEUE_NAME, "你好， 梁桂钊!");
//        rabbitTemplate.convertAndSend(RabbitMQConfig.QUEUE_NAME, "你好， 梁桂钊!");
    }
}

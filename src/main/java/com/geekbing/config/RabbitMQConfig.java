package com.geekbing.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author: bing
 * Date: 2017-02-07 13:06
 * Email: dhuzbb@163.com
 */

@Configuration
public class RabbitMQConfig {
    public static final String QUEUE_NAME = "spring-boot-simple";

    @Bean
    public Queue queue() {
        return new Queue(QUEUE_NAME);
    }
}

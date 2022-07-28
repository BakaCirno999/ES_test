package com.example.provider.controller;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rab")
public class rabTest {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @RequestMapping("/1")

    public String rabT(){
        rabbitTemplate.convertAndSend("delay", "delay", "aaa");
//        rabbitTemplate.convertAndSend("dela", "delay", 2);
        return "发送成功";
    }
}

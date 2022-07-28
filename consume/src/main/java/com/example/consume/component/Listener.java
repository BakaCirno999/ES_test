package com.example.consume.component;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@RabbitListener(queues = "delay")
public class Listener {
    @RabbitHandler
    public void handler(Integer id, Channel channel) throws IOException {
//        byte[] body = id.getBody();
        System.out.println(id);
        channel.basicAck(1,false);//正确
//        channel.basicAck(1,true);//失败
    }

}

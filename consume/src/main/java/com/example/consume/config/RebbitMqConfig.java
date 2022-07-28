package com.example.consume.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RebbitMqConfig {
    /**
     * 延迟队列所绑定的交换机
     * @return
     */
//    @Bean
//    DirectExchange delayExchange(){
//        return (DirectExchange) ExchangeBuilder.directExchange("delay")
//                .durable(true)
//                .build();
//    }
//    @Bean
//    public Queue delayQueue(){
//        return QueueBuilder
//                .durable("delay")
//                .withArgument("x-dead-letter-exchange", "delay")
//                .withArgument("x-dead-letter-routing-key", "delay")
//                .build();
//    }
//    @Bean
//    public Binding delayBinding(Queue delayQueue, DirectExchange delayExchange){
//        return BindingBuilder
//                .bind(delayQueue)
//                .to(delayExchange)
//                .with("delay");
//    }

//    /**
//     * 普通交换机名称
//     */
//    public static final String EXCHANGE_X = "X";
//    /**
//     * 死信交换机名称
//     */
//    public static final String EXCHANGE_DEAD_Y = "Y";
//    /**
//     * 普通队列名称
//     */
//    public static final String QUEUE_A = "QA";
//    public static final String QUEUE_B = "QB";
//    /**
//     * 死信队列名称
//     */
//    public static final String QUEUE_DEAD_D = "QD";
//
//    /**
//     * 声名 普通交换机（EXCHANGE_X）
//     * @return 普通交换机
//     */
//    @Bean
//    public DirectExchange EXCHANGEX(){
//        return new DirectExchange(EXCHANGE_X);
//    }
//
//    /**
//     * 声名 死信交换机（EXCHANGE_DEAD_Y）
//     * @return 死信交换机
//     */
//    @Bean
//    public DirectExchange EXCHANGEDEADY(){
//        return new DirectExchange(EXCHANGE_DEAD_Y);
//    }
//
//    /**
//     * 声名普通队列 QUEUE_A TTL为10s
//     * @return 普通队列 QUEUE_A
//     */
//    @Bean
//    public Queue QUEUE_A(){
//        return QueueBuilder.durable(QUEUE_A)
//                .withArgument("x-dead-letter-exchange",EXCHANGE_DEAD_Y)
//                .withArgument("x-dead-letter-routing-key","YD")
//                .withArgument("x-message-ttl",100000)
//                .build();
//        //声名参数
////        Map<String, Object> arguments = new HashMap<>(3);
//        //设置死信交换机
////        arguments.put("x-dead-letter-exchange",EXCHANGE_DEAD_Y);
//        //设置死信RoutingKey
////        arguments.put("x-dead-letter-routing-key","YD");
//        //设置 TTL 10s
////        arguments.put("x-message-ttl",10000);
//
////        return QueueBuilder.durable(QUEUE_A).withArguments(arguments).build();
//    }
//
//    /**
//     * 声名普通队列 QUEUE_B TTL为40s
//     * @return 普通队列 QUEUE_B
//     */
//    @Bean
//    public Queue QUEUE_B(){
//        //声名参数
//        return QueueBuilder.durable(QUEUE_B)
//                .withArgument("x-dead-letter-exchange",EXCHANGE_DEAD_Y)
//                .withArgument("x-dead-letter-routing-key","YD")
//                .withArgument("x-message-ttl",400000)
//                .build();
//        //设置死信交换机
//        //设置死信RoutingKey
//        //设置 TTL 40s
//
////        return QueueBuilder.durable(QUEUE_B).withArguments(arguments).build();
//    }
//
//    /**
//     * 声名死信队列 QUEUE_DEAD_D
//     * @return 死信队列 QUEUE_DEAD_D
//     */
//    @Bean
//    public Queue QUEUE_DEAD_D(){
//        return QueueBuilder.durable(QUEUE_DEAD_D).build();
//    }
//
//    /**
//     * 普通队列QA 通过 routingKey XA 绑定 普通交换机X
//     * @param QUEUE_A 普通队列QA
//     * @param EXCHANGEX 普通交换机X
//     * @return 绑定
//     */
//    @Bean
//    public Binding queueABindingX(Queue QUEUE_A,DirectExchange EXCHANGEX){
//        return BindingBuilder
//                .bind(QUEUE_A)
//                .to(EXCHANGEX)
//                .with("XA");
//    }
//
//    /**
//     * 普通队列QB 通过 routingKey XB 绑定 普通交换机X
//     * @param QUEUE_B 普通队列QB
//     * @param EXCHANGEX 普通交换机X
//     * @return 绑定
//     */
//    @Bean
//    public Binding queueBBindingX(Queue QUEUE_B,DirectExchange EXCHANGEX){
//        return BindingBuilder
//                .bind(QUEUE_B)
//                .to(EXCHANGEX)
//                .with("XB");
//    }
//
//    /**
//     * 死信队列QD 通过 routingKey YD 绑定 死信交换机Y
//     * @param QUEUE_DEAD_D 死信队列QD
//     * @param EXCHANGEDEADY 死信交换机Y
//     * @return 绑定
//     */
//    @Bean
//    public Binding queueDBindingX(Queue QUEUE_DEAD_D,DirectExchange EXCHANGEDEADY){
//        return BindingBuilder
//                .bind(QUEUE_DEAD_D)
//                .to(EXCHANGEDEADY)
//                .with("YD");
//    }

}

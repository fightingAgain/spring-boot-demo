//package com.example.rabbitmq;
//
//import org.springframework.amqp.core.FanoutExchange;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.scheduling.annotation.EnableScheduling;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//import java.util.Random;
//
///**
// * Created by liuhui on 2016/2/18.
// * 发布/订阅模式
// */
//@EnableScheduling
//@Component
//public class RabbitSendTask {
//
//    @Autowired
//    private RabbitTemplate rabbitTemplate;
//
//    @Autowired
//    private FanoutExchange fanoutExchange;
//
//    @Bean
//    public FanoutExchange fanout() {
//        return new FanoutExchange("tut.fanout");
//    }
//
//    @Scheduled(cron = "0/5 * * * * ?")
//    public void sendMessage(){
//        RabbitVO rabbitVO = new RabbitVO();
//        String[] data = new String[]{"1","2","3","4","5","6","7","8","9"};
//        rabbitVO.setId(data[new Random().nextInt(9)]);
//        rabbitVO.setDesc("测试");
//        this.rabbitTemplate.convertAndSend(fanoutExchange.getName(), "", rabbitVO);
//    }
//}

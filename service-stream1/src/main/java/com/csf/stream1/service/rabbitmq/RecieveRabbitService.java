package com.csf.stream1.service.rabbitmq;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author orangeC
 * @description
 * @date 2019/10/5 17:06
 */

/*@EnableBinding(Sink.class)
public class RecieveRabbitService {

    @StreamListener(Sink.INPUT)
    public void receive(Object payload){
        System.out.println(payload);
    }
}*/

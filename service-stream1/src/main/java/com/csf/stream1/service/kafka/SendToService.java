package com.csf.stream1.service.kafka;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;

/**
 * @author orangeC
 * @description
 * @date 2019/10/6 17:16
 */
//@EnableBinding(SendToBinder.class)
public class SendToService {

    @StreamListener(SendToBinder.INPUT)
    @SendTo(SendToBinder.OUTPUT)
    public Object recieveFromInput(Object payload){
        System.out.println("中转消息：" + payload);
        return payload;
    }
}

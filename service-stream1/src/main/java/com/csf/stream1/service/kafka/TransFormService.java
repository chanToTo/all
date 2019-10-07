package com.csf.stream1.service.kafka;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.integration.annotation.ServiceActivator;

/**
 * @author orangeC
 * @description
 * @date 2019/10/6 16:47
 */
//@EnableBinding(Processor.class)
public class TransFormService {

    @ServiceActivator(inputChannel = Processor.INPUT,outputChannel = Processor.OUTPUT)
    public Object transform(Object payload){
        System.out.println("消息中转站：" + payload);
        return payload;
    }
}

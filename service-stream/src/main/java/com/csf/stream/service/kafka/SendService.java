package com.csf.stream.service.kafka;

import com.csf.domain.MessageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;

import java.util.UUID;


/**
 * @author orangeC
 * @description
 * @date 2019/10/5 16:53
 */
@EnableBinding(MySource.class)
public class SendService {
    @Autowired
    private MySource source;

    public void sendMsg(String message){
        MessageDto messageDto = new MessageDto();
        messageDto.setId(0L);
        messageDto.setMsg(message);
        source.myOutput().send(MessageBuilder.withPayload(messageDto).build());
    }
}

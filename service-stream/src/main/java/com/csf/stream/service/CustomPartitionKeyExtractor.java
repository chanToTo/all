package com.csf.stream.service;

import com.csf.domain.MessageDto;
import org.springframework.cloud.stream.binder.PartitionKeyExtractorStrategy;
import org.springframework.messaging.Message;

/**
 * @author orangeC
 * @date 2019/10/10 18:47
 * @desc
 */
public class CustomPartitionKeyExtractor implements PartitionKeyExtractorStrategy {
    @Override
    public Object extractKey(Message<?> message) {
        Object obj = message.getPayload();
        System.out.println("消息载荷：" + obj);
        if (obj instanceof MessageDto) {
            MessageDto person = (MessageDto) obj;
            return person.getId();
        }
        return null;
    }
}

package com.csf.stream.service.kafka;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MySource {

    String OUTPUT = "myOutput";

    @Output(MySource.OUTPUT)
    MessageChannel myOutput();
}

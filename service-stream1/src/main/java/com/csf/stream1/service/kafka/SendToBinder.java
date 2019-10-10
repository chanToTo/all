package com.csf.stream1.service.kafka;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface SendToBinder {

    String INPUT = "input";

    String OUTPUT = "output";

    @Output(SendToBinder.OUTPUT)
    MessageChannel output();

    @Input(SendToBinder.INPUT)
    MessageChannel input();
}

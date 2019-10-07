package com.csf.stream1.service.kafka;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface SendToBinder {

    @Output("output")
    MessageChannel output();

    @Input("input")
    MessageChannel input();
}

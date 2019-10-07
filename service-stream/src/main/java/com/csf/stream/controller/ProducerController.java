package com.csf.stream.controller;

import com.csf.stream.service.kafka.SendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author orangeC
 * @description
 * @date 2019/10/5 17:00
 */
@RestController
public class ProducerController {

    @Autowired
    private SendService sendService;

    @RequestMapping("/send/{message}")
    public void send(@PathVariable("message") String message){
        sendService.sendMsg(message);
    }

}



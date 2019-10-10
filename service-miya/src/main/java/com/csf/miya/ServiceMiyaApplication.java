package com.csf.miya;

import brave.sampler.Sampler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.instrument.web.ClientSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author orangeC
 * @description
 * @date 2019/10/4 19:46
 */
@SpringBootApplication
@RestController
public class ServiceMiyaApplication {
    private static final Logger LOG = Logger.getLogger(ServiceMiyaApplication.class.getName());
    public static void main(String[] args) {
        SpringApplication.run(ServiceMiyaApplication.class,args);
    }

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @RequestMapping("/hi")
    public String home(){
        LOG.log(Level.INFO, "hi is being called");
        return "hi i'm miya!";
    }

    @RequestMapping("/miya")
    @ClientSampler
    public String info(){
        LOG.log(Level.INFO, "info is being called");
//        return restTemplate.getForObject("http://localhost:8988/info",String.class);
        String send = "who are you?";
        return restTemplate.getForObject("http://localhost:7777/send/" + send,String.class);
    }

    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}

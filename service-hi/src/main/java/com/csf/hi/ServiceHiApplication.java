package com.csf.hi;

import brave.sampler.Sampler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author orangeC
 * @description
 * @date 2019/10/4 19:39
 */
@SpringBootApplication
@RestController
public class ServiceHiApplication {
    private static final Logger LOG = Logger.getLogger(ServiceHiApplication.class.getName());
    public static void main(String[] args) {
        SpringApplication.run(ServiceHiApplication.class,args);
    }
    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
    @RequestMapping("/hi")
    public String callHome(){
        LOG.log(Level.INFO,"calling trace service-hi");
        return restTemplate.getForObject("http://localhost:8989/miya",String.class);
    }
    @RequestMapping("/info")
    public String info(){
        LOG.log(Level.INFO,"calling trace service-hi");
        return "i'm service hi";
    }

    public Sampler defaultSampler(){
        return Sampler.ALWAYS_SAMPLE;
    }
}

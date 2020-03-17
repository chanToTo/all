package com.csf.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = MongoAutoConfiguration.class)
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class EurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class,args);
    }
/*
    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/sayHi")
    public String sayHi(@RequestParam(value = "name", defaultValue = "eurekaClient") String name){
        return "hello world!" + port;
    }*/
}

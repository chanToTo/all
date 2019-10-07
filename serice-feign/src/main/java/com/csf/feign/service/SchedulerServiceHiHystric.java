package com.csf.feign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedulerServiceHiHystric implements SchedualServiceHi{
    @Override
    public String sayHiFormClientOne(String name) {
        return "sorry" + name;
    }
}

package com.csf.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "all-eureka-client",fallback = SchedulerServiceHiHystric.class)
public interface SchedualServiceHi {

    @RequestMapping(value = "/sayHi",method = RequestMethod.GET)
    String sayHiFormClientOne(@RequestParam(value = "name") String name);
}

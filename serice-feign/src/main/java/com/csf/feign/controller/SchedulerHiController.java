package com.csf.feign.controller;

import com.csf.feign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchedulerHiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/sayHi")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFormClientOne( name );
    }
}

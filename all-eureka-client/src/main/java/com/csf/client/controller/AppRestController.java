package com.csf.client.controller;

import com.csf.client.api.AppRestApiImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {

    @Autowired
    private AppRestApiImpl appRestApi;

    @RequestMapping(value = "/index")
    public String index(@RequestBody String reqJsonString){
        return appRestApi.search(reqJsonString);
    }
}

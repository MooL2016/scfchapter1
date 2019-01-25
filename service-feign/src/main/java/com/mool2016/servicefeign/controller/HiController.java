package com.mool2016.servicefeign.controller;

import com.mool2016.servicefeign.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    HiService hiService;

    @GetMapping("/hi")
    public String sayHi(){
        return hiService.sayHiFromClientOne();
    }
}

package com.mool2016.serviceribbon.controller;

import com.mool2016.serviceribbon.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HiService hiService;

    @GetMapping(value = "/hi")
    public String hi() {
        return hiService.hiService();
    }
}

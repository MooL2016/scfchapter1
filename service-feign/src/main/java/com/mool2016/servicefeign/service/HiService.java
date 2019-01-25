package com.mool2016.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-hi")
public interface HiService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne();
}

package com.example.consumerfeign.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(serviceId = "EUREKA-CLIENT")
public interface ClientService {

    @RequestMapping("/count")
    String count(@RequestParam("a") Integer a ,@RequestParam("b") Integer b);
}

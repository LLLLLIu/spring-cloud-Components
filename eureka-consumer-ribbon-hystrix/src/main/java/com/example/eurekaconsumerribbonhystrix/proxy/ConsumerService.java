package com.example.eurekaconsumerribbonhystrix.proxy;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * <p></p>
 * <p>
 * **********************************************************************
 * Date				            	Author 		      	    Changes
 * 2018-05-22 16:41    				liurenjie           	New(新建)
 * **********************************************************************
 */
@Component
public class ConsumerService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public String fetch(){
        String url ="http://EUREKA-CLIENT/count?a=1&b=2";
        System.out.print(url);
        return restTemplate.getForObject(url,String.class);
    }

    public String fallback(){
        return "fallback";
    }
}

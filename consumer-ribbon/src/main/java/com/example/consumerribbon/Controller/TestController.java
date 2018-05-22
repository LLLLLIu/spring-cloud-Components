package com.example.consumerribbon.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <p></p>
 * <p>
 * **********************************************************************
 * Date				            	Author 		      	    Changes
 * 2018-05-22 14:04    				liurenjie           	New(新建)
 * **********************************************************************
 */
@RestController
public class TestController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("index")
    public String index(){
        String url ="http://EUREKA-CLIENT/count?a=1&b=2";
        System.out.print(url);
        return restTemplate.getForObject(url,String.class);
    }
}

package com.example.eurekaclient.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>测试</p>
 * <p>
 * **********************************************************************
 * Date				            	Author 		      	    Changes
 * 2018-05-22 11:14    				liurenjie           	New(新建)
 * **********************************************************************
 */
@RestController
public class ClientController {

    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping("/index")
    public String index(){
        String services =  "Services " + discoveryClient.getServices();
        return services;
    }

    @RequestMapping("/count")
    public String count(Integer a ,Integer b){
        System.out.print(a+b);
        return a+b+"";
    }
}

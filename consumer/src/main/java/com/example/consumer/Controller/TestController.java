package com.example.consumer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <p></p>
 * <p>
 * **********************************************************************
 * Date				            	Author 		      	    Changes
 * 2018-05-22 13:23    				liurenjie           	New(新建)
 * **********************************************************************
 */
@RestController
public class TestController {

    /**
     * 客户端负载均衡器
     */
    @Autowired
    LoadBalancerClient loadBalancerClient;
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("index")
    public String index(){
        ServiceInstance instance = loadBalancerClient.choose("EUREKA-CLIENT");
        String url ="http://"+instance.getHost()+":"+instance.getPort()+"/count?a=1&b=2";
        System.out.print(url);
        return restTemplate.getForObject(url,String.class);
    }
}

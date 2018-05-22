package com.example.eurekaconsumerribbonhystrix.Controller;

import com.example.eurekaconsumerribbonhystrix.proxy.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <p></p>
 * <p>
 * **********************************************************************
 * Date				            	Author 		      	    Changes
 * 2018-05-22 16:39    				liurenjie           	New(新建)
 * **********************************************************************
 */
@RestController
public class TestController {

    @Autowired
    ConsumerService consumerService;

    @RequestMapping("/index")
    public String index(){
        return consumerService.fetch();
    }
}

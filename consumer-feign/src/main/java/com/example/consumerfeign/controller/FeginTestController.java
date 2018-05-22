package com.example.consumerfeign.controller;

import com.example.consumerfeign.proxy.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p></p>
 * <p>
 * **********************************************************************
 * Date				            	Author 		      	    Changes
 * 2018-05-22 14:21    				liurenjie           	New(新建)
 * **********************************************************************
 */
@RestController
public class FeginTestController {

    @Autowired
    ClientService clientService;

    @RequestMapping("/index")
    public String index(){
        return clientService.count(5,8);
    }
}

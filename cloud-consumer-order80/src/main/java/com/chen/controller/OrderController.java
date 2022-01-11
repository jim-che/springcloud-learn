package com.chen.controller;

import entities.Payment;
import entities.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

/**
 * @author chenguo
 * @date 2022/1/11 1:10 下午
 */
@RestController
@Slf4j
@RequestMapping("/consumer")
public class OrderController {
    public static final String PAYMENT_URL = "http://localhost:8001/payment";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/payment/create")
    public Result create(@RequestBody Payment payment){
        return restTemplate.postForObject(PAYMENT_URL + "/create", payment, Result.class);
    }

    @GetMapping("/payment/get")
    public Result create(@PathParam("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL + "/get?id="+id, Result.class);
    }

}

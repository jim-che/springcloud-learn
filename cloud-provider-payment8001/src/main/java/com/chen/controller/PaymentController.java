package com.chen.controller;

import com.chen.service.PaymentService;
import entities.Payment;
import entities.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

/**
 * @author chenguo
 * @date 2022/1/11 12:42 下午
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping("/create")
    public Result create(@RequestBody Payment payment){
        System.out.println("-----------");
        System.out.println(payment);
        System.out.println("-----------");
        boolean save = paymentService.saveOrUpdate(payment);
        if(save){
            return Result.success(payment);
        }else{
            return Result.failed("插入失败");
        }
    }

    @GetMapping("/get")
    public Result getPaymentById(@PathParam("id") Long id){
        Payment payment = paymentService.getById(id);
        if(payment != null){
            return Result.success(payment);
        }else{
            return Result.failed("没有匹配的记录, 查询id为: " + id);
        }
    }

}

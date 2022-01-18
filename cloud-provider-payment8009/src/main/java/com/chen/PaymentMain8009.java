package com.chen;

import entities.Payment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author chenguo
 * @date 2022/1/18 10:49 上午
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8009 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8009.class, args);
    }
}

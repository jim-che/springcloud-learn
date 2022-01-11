package com.chen.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chen.mapper.PaymentMapper;
import com.chen.service.PaymentService;
import entities.Payment;
import org.springframework.stereotype.Service;

/**
 * @author chenguo
 * @date 2022/1/11 12:36 下午
 */
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements PaymentService {
}

package com.chen.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import entities.Payment;
import org.apache.ibatis.annotations.Mapper;

import javax.xml.ws.soap.MTOM;

/**
 * @author chenguo
 * @date 2022/1/11 12:33 下午
 */
@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {
}

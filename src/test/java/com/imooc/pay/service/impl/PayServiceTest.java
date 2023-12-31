package com.imooc.pay.service.impl;

import com.imooc.pay.PayApplicationTests;
import com.lly835.bestpay.enums.BestPayTypeEnum;
import org.junit.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public class PayServiceTest extends PayApplicationTests {
    @Autowired
    private PayServiceImpl payService;
    @Autowired
    private AmqpTemplate amqpTemplate;
    @Test
    public void create() {
        // 不要用 new BigDecimal(0.01)
        payService.create("2634627231", BigDecimal.valueOf(0.01), BestPayTypeEnum.WXPAY_NATIVE);
    }
    @Test
    public void sendMQMsg(){
        amqpTemplate.convertAndSend("payNotify","hello");
    }
}
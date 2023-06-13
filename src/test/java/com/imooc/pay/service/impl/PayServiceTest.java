package com.imooc.pay.service.impl;

import com.imooc.pay.PayApplication;
import com.imooc.pay.PayApplicationTests;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;
public class PayServiceTest extends PayApplicationTests {
    @Autowired
    private PayService payService;
    @Test
    public void create() {
        // 不要用 new BigDecimal(0.01)
        payService.create("2634627231", BigDecimal.valueOf(0.01));
    }
}
package com.imooc.pay.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "wx")
@Data
// use @Data then we don't need to write getter setter
public class WxAccountConfig {
    private String appId;
    private String mchId;
    private String mchKey;
    private String notifyUrl;
    private String returnUrl;
}

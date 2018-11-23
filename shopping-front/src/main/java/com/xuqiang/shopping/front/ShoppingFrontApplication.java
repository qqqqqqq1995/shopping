package com.xuqiang.shopping.front;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author xuqiang
 * @date 2018/11/23
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class ShoppingFrontApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShoppingFrontApplication.class, args);
    }
}

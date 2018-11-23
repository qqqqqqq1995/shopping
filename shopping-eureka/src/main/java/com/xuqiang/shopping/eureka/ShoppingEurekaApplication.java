package com.xuqiang.shopping.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author xuqiang
 * @date 2018/11/22
 */
@EnableEurekaServer
@SpringBootApplication
public class ShoppingEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShoppingEurekaApplication.class, args);
    }
}

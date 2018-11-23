package com.xuqiang.shopping.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author xuqiang
 * @date 2018/11/23
 */
@EnableConfigServer
@SpringBootApplication
public class ShoppingConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShoppingConfigApplication.class, args);
    }
}

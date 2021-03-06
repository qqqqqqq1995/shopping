package com.xuqiang.shopping.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xuqiang
 * @date 2018/11/22
 */
@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.xuqiang.shopping.product.mapper")
public class ShoppingProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShoppingProductApplication.class, args);
    }
}

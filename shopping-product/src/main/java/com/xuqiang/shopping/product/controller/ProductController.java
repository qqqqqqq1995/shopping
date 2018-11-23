package com.xuqiang.shopping.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author xuqiang
 * @date 2018/11/22
 */
@RestController
@RequestMapping("shopping/product")
public class ProductController {

    @RequestMapping("say")
    public String sayHello() {
        return "hello world;";
    }

    @Value("${server.port}")
    private int port;
    @RequestMapping("url")
    public String url() {
        return "product-server:" + port;
    }
}

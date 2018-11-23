package com.xuqiang.shopping.front.controller;

import com.xuqiang.shopping.front.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author xuqiang
 * @date 2018/11/23
 */
@Controller
@RequestMapping("shopping/front")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("url")
    @ResponseBody
    public String url(HttpServletRequest request){
        return productService.url();
    }
}

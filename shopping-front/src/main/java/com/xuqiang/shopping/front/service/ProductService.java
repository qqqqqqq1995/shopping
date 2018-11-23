package com.xuqiang.shopping.front.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author xuqiang
 * @date 2018/11/23
 */
@Service
@FeignClient("product-server")
@RequestMapping("shopping/product")
public interface ProductService {
    @RequestMapping(value = "url", method = RequestMethod.GET)
    String url();
}

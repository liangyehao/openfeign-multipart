package com.liang.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/4/25 19:34
 * @content
 */
@FeignClient(name = "provider" ,url = "http://localhost:8080")
public interface FeignService {

    /**
     * 测试装
     *
     * @return {@link String}
     */
    @GetMapping("/provider/multipart/testFeign")
    public String testFeign();
}

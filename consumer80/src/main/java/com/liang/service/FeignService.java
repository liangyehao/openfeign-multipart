package com.liang.service;

import com.liang.config.ClientConfiguration;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/4/25 19:34
 * @content
 */
@FeignClient(name = "provider" ,url = "http://localhost:8080", configuration = ClientConfiguration.class)
public interface FeignService {

    /**
     * 测试装
     *
     * @return {@link String}
     */
    @GetMapping("/provider/multipart/testFeign")
    String testFeign();

    @PostMapping(value = "/provider/multipart/uploadFile1",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    String uploadFile1(MultipartFile[] files);
}

package com.liang.controller;

import com.liang.entity.dto.FileDTO;
import com.liang.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/4/25 18:43
 * @content
 */
@RestController
@RequestMapping("/multipart")
public class MultipartFileController {

    @Autowired
    private FeignService feignService;

    @PostMapping("/uploadFile")
    public String uploadFile(FileDTO fileDTO){
        System.out.println(fileDTO);
        return "ok";
    }

    @GetMapping("/testFeign")
    private String testFeign(){
        System.out.println("test feign");
        return feignService.testFeign();
    }

    @PostMapping("/uploadFile1")
    public String uploadFile1(MultipartFile[] files){
        return feignService.uploadFile1(files);
    }
}


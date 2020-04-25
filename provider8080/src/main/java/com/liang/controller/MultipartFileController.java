package com.liang.controller;

import com.liang.entity.dto.FileDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/4/25 18:16
 * @content
 */
@RestController
@RequestMapping("/multipart")
public class MultipartFileController {

    @PostMapping("/uploadFile")
    public String uploadFile(FileDTO fileDTO){
        System.out.println(fileDTO);
        return "ok";
    }

    @GetMapping("/testFeign")
    public String testFeign(){
        System.out.println("---------- test feign in provider");
        return "---------- test feign in provider";
    }

    @PostMapping("/uploadFile1")
    public String uploadFile1(MultipartFile[] files){
        return "ok in  provider";
    }
}

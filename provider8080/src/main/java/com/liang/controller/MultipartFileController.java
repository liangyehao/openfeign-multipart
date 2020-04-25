package com.liang.controller;

import com.liang.entity.dto.FileDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}

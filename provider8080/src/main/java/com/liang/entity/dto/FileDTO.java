package com.liang.entity.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/4/25 18:23
 * @content
 */
@Data
public class FileDTO {
    private String id;
    private MultipartFile file;
    private MultipartFile[] files;
}

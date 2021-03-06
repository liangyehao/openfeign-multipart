package com.liang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/4/25 18:42
 * @content
 */
@EnableFeignClients
@SpringBootApplication
public class Consumer80 {
    public static void main(String[] args) {
        SpringApplication.run(Consumer80.class,args);
    }
}

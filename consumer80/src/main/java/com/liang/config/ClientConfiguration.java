package com.liang.config;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/4/25 22:30
 * @content
 */

import feign.codec.Encoder;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;

/**
 * 配置类
 * @author liangyehao
 */
public class ClientConfiguration {
    /**
     * 此处注入的是： ObjectFactory<HttpMessageConverters>
     */
    @Autowired
    private ObjectFactory<HttpMessageConverters> messageConverters;

    @Bean
    public Encoder feignEncoder() {
        return new SpringMultipartEncoder(new SpringEncoder(messageConverters));
    }


}

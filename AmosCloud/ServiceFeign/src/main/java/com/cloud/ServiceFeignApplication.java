package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Desc：
 * @Author: wangk
 * @Date: 2019/6/18 16:01
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class ServiceFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run( ServiceFeignApplication.class, args );
    }
}

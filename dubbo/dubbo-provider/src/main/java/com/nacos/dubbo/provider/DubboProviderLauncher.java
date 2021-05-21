package com.nacos.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：黑洞里的光
 * @date ：Created in 2021/5/21 10:43
 * @description：启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DubboProviderLauncher {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderLauncher.class,args);
    }
}

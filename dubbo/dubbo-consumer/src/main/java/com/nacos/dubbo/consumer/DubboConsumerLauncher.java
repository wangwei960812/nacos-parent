package com.nacos.dubbo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：黑洞里的光
 * @date ：Created in 2021/5/21 14:04
 * @description：消费端
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DubboConsumerLauncher {
    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerLauncher.class,args);
    }

}

package com.nacos.dubbo.provider.service.impl;

import com.nacos.dubbo.api.EchoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author ：黑洞里的光
 * @date ：Created in 2021/5/21 11:22
 * @description：实现类
 */
@Slf4j
@Service(version = "1.0",protocol = "dubbo")
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String str) {
        log.info("服务提供者端入参：{}",str);
        return "dubbo provider echo:"+str;
    }
}

package com.nacos.dubbo.consumer.controller;

import com.nacos.dubbo.api.EchoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：黑洞里的光
 * @date ：Created in 2021/5/21 13:58
 * @description：前端控制器
 */
@Slf4j
@RestController
@RequestMapping("/dubbo/echo")
public class EchoController {

    @Reference(version = "1.0")
    private EchoService echoService;

    @GetMapping("/{str}")
    public String echo(@PathVariable String str){
        log.info("dubbo 消费端入参：{}",str);
        return echoService.echo(str);
    }
}

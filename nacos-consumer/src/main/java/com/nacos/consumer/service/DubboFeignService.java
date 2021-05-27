package com.nacos.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("dubbo-consumer")
@RequestMapping("/dubbo/echo")
public interface DubboFeignService {
    @GetMapping("/{str}")
    String echo(@PathVariable(name = "str") String str);

}

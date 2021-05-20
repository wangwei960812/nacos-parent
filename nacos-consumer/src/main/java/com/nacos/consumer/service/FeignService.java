package com.nacos.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("nacos-provider")
@RequestMapping("/echo")
public interface FeignService {

    @GetMapping("/{string}")
    String echo(@PathVariable(name = "string") String string);

    @GetMapping("/file/path/{fileName}")
    String getFilePath(@PathVariable(name = "fileName") String fileName);

}

package com.nacos.consumer.controller;

import com.nacos.consumer.service.FeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/echo")
public class TestController {

    private final RestTemplate restTemplate;

    @Resource
    private FeignService feignService;

    @Autowired
    public TestController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(value = "/common/{str}")
    public String echo(@PathVariable("str") String str) {
        log.info("str:{}", str);
        return restTemplate.getForObject("http://nacos-provider/echo/" + str, String.class);
    }

    @GetMapping(value = "/feign/{str}")
    public String feignEcho(@PathVariable("str") String str) {
        log.info("str:{}", str);
        return feignService.echo(str);
    }

    @GetMapping(value = "/feign/file/path/{fileName}")
    public String getFilePath(@PathVariable("fileName") String fileName) {
        log.info("fileName:{}", fileName);
        return feignService.getFilePath(fileName);
    }
}

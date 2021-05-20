package com.nacos.provider.controller;

import com.nacos.provider.service.FileStorageInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 *Endpoint
 */
@Slf4j
@RestController
@RequestMapping("/echo")
public class EchoController {

    @Resource
    private FileStorageInfoService fileStorageInfoService;

    @GetMapping(value = "/{string}")
    public String echo(@PathVariable String string, HttpServletRequest req){
        log.info("getRemoteUser:{}",req.getRemoteUser());
        log.info("getRequestURI:{}",req.getRequestURI());
        log.info("getRequestURL:{}",req.getRequestURL());
        log.info("getRemoteAddr:{}",req.getRemoteAddr());
        log.info("getRemoteHost:{}",req.getRemoteHost());
        log.info("getRemotePort:{}",req.getRemotePort());
        return "Hello Nacos Discovery "+string;
    }

    @GetMapping(value = "/file/path/{fileName}")
    public String getFilePath(@PathVariable String fileName){
        log.info("getFilePath入参fileName:{}",fileName);
        return fileStorageInfoService.queryPathByName(fileName);
    }
}

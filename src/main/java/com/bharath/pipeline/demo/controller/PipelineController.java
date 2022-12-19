package com.bharath.pipeline.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class PipelineController {
    @GetMapping("/get")
    public String test(){
        return "test completed";
    }
}

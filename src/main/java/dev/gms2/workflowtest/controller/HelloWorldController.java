package dev.gms2.workflowtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String hello() {
        return "v1 - Hello workflowtest";
    }

    @GetMapping("/hello/v2")
    public String hello() {
        return "v2 - Hello workflowtest";
    }

}

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
    public String helloV2() {
        return "v2 - Hello workflowtest";
    }

    @GetMapping("/hello/v3")
    public String helloV3() {
        return "v3 - Hello workflowtest";
    }

    @GetMapping("/hello/v4")
    public String helloV4() {
        return "v4 - Hello workflowtest";
    }

    @GetMapping("/hello/v6")
    public String helloV6() {
        return "v6 - Hello workflowtest";
    }
    
    @GetMapping("/hello/v8")
    public String helloV8() {
        return "v8 - Hello workflowtest";
    }

    @GetMapping("/hello/v9")
    public String helloV9() {
        return "v9 - Hello workflowtest";
    }


}

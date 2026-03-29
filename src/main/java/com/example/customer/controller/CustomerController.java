package com.example.customer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("/ping")
    public String ping() {
        return "this is chandu and here i'm exploring devops";
    }

    @GetMapping("/version")
    public String version() {
        return "here is no version";
    }

    @GetMapping("/location")
    public String location() {
        return "i live in vijayawada";
    }
}

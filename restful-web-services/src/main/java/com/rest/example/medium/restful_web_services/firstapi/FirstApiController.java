package com.rest.example.medium.restful_web_services.firstapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstApiController {

    @GetMapping(path = "/hello-rest")
    public String helloREST() {
        return "Hello, it's my first REST API!";
    }

    @GetMapping(path = "/hello-rest-two")
    public String helloRESTTwo() {
        return "Hello, it's my second REST API!";
    }

    @GetMapping(path = "/hello-rest-with-class")
    public WithClass helloRESTWithClass() {
        return new WithClass("Hello from a class!");
    }

    @GetMapping(path = "/hello-rest-with-method")
    public String helloRESTWithMethod() {
        return withMethod("Hello from a method!");
    }

    private String withMethod(String message) {
        return message;
    }
}

package com.example.demo.controller;

import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

@RestController
public class Errorhandler implements ErrorController
{   
    private final ErrorAttributes errorAttributes;

    public Errorhandler(ErrorAttributes errorAttributes) {
        this.errorAttributes = errorAttributes;
    }

    @GetMapping("/error")
    public Map<String, Object> error(WebRequest  request) {
        Map<String, Object> error = errorAttributes.getErrorAttributes(request, ErrorAttributeOptions.defaults());
        if (error.containsKey("error"))
            return Map.of("error", error.get("error"));
        return Map.of("error", "Unknown error");
    }
}
package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class DivideController {
    @GetMapping("/divide")
    public double sayHello(@RequestParam double numberOne , @RequestParam double numberTwo) {
        if (numberTwo == 0)
            throw new Error("Cannot divide by zero");
        else return numberOne / numberTwo;
    }   
}
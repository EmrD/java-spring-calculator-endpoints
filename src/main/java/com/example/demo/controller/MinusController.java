package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class MinusController {
    @GetMapping("/minus")
    public double sayHello(@RequestParam double numberOne , @RequestParam double numberTwo) {
        return numberOne - numberTwo;
    }
}
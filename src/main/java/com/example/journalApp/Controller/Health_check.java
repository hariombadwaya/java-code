package com.example.journalApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Health_check {
    @GetMapping("/health_check")
    public String healthcheck()
    {
        return "ok";
    }
}

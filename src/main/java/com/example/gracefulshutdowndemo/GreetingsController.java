package com.example.gracefulshutdowndemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingsController {
    
    @GetMapping("/greeting")
    public String greeting() throws java.lang.InterruptedException {
        Thread.sleep(60000);
        return "hello!";
    }

}
package com.shruti.tues.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class GreetingController {
    @RequestMapping
            ("/")
    public String getMyGreeting(){
        return "\n **** Hello from my website **** \n";
    }
}

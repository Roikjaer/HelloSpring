package com.example.hellospring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/first")
    public String firstEndpoint(){
        String message = "God onsdag";
        return message;
    }

    @GetMapping("/welcome")
    public String welcome(){
        String message = "Velkommen til verdens grimmeste applikation";
        return message;
    }

    @GetMapping("/example")
    public String params(@RequestParam String p1){
        if(p1.equals("nicklas")){
            return "Goated softwareudvikler";
        }
        return "Ingen";
    }
}

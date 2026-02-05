package com.example.hellospring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.time.LocalDate;

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


    @GetMapping("/echo")
    public String params(@RequestParam String input){
        if(input.equalsIgnoreCase("HelloData-GBG-E25D")){
            return "HelloDATA-GBG-E25D";
        }
        else{
            return "Hov nej tak";
        }
    }

   @GetMapping("/length")
   public String params1(@RequestParam String text){
        return String.valueOf(text.length());


   }

    @GetMapping("/hello")
    public String secondEndPoint(){
        String sødBesked = "Hej hav en mega fed dag";

        return sødBesked;
    }

   @GetMapping("/word-count")
    public String params2(@RequestParam String text){
        int countWords = text.split("\\s").length;
        return String.valueOf(countWords);



    }

    @GetMapping("/until-friday")
    public String erDetFredag(){
        int dayNumber = LocalDate.now().getDayOfWeek().getValue();
        boolean fredag;
        if(dayNumber == 5){
            fredag = true;
        } else {
            fredag = false;
        }

        if(fredag){
            return "YES";
        }
        else return "NO - Days till friday: " + (5 - dayNumber + 7) % 7;

    }


}

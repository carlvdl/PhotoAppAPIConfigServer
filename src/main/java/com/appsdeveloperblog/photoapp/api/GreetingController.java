package com.appsdeveloperblog.photoapp.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting() {
        System.out.println("Fucking this");
        return "Fuck this d";
    }
}

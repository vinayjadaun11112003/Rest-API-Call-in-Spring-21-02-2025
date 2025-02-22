package com.example.Rest_API_calls.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
//Rest Controller Class
public class RestControllers {
    //GET Request from /getHello Path.
    @GetMapping("/getHello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    //GET Request by RequestParameter from /query?name=vinayJadaun
    @GetMapping("/query")
    public String sayHelloo(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}



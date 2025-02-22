package com.example.Rest_API_calls.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
//Rest Controller Class
public class RestControllers {
    //UC01 : GET Request from /getHello Path.
    @GetMapping("/getHello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    //UC02 : GET Request by RequestParameter from /query?name=vinayJadaun
    @GetMapping("/query")
    public String sayHelloo(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    //UC03 : GET Request by PathVariable from /param/vinay
    @GetMapping("/param/{name}")
    public String sayHellooo(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    //UC04 : GET Request by RequestBody from /post and convert it to the java object by using internal deserialization.
    @PostMapping("/post")
    public String postmethod(@RequestBody NameRequest request) {
        return "Hello " + request.getName() + " from BridgeLabz";
    }
}

//Name Request which will Convert RequestBody raw json data to java object.
class NameRequest {
    private String name;

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



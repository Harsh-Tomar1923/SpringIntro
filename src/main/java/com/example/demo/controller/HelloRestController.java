package com.example.demo.controller;
import org.springframework.web.bind.annotation .*;


@RestController
@RequestMapping("/hello")
public class HelloRestController {

    @GetMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello From BridgeLabz! ! !";

    }
    @GetMapping("/query")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " From BridgeLabz! !";
    }
}
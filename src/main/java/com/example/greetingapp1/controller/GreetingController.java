package com.example.greetingapp1.controller;

import com.example.greetingapp1.modal.Greeting;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    private  static final String template="Hello, %s!";
    private  final AtomicLong counter=new AtomicLong();

    @GetMapping(value = {"","/","/home"})
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "world") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }


    @PostMapping("/post")
    public Greeting postGreeting(@RequestBody Greeting greeting) {
        return new Greeting(counter.incrementAndGet(), String.format(template, greeting.getMessage()));
    }


    @PutMapping("/put/{id}")
    public Greeting putGreeting(@PathVariable int id, @RequestParam(value = "name") String name) {
        return new Greeting(id, String.format(template, name));
    }



}

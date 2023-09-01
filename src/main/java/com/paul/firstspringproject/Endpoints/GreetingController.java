package com.paul.firstspringproject.Endpoints;

import com.paul.firstspringproject.EntityManager.QuotesService;
import com.paul.firstspringproject.Model.Quotes;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
@CrossOrigin(origins = {"http://localhost:8080", "http://localhost:8081"})
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @CrossOrigin(origins = {"http://localhost:8080", "http://localhost:8081"})
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}

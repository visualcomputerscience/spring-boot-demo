package org.example;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello back updated 10!!";
    }

    @GetMapping("/hello/{param}")
    public String helloWorldWithParam(@PathVariable Integer param) {
        return "Hello back with param " + param;
    }

    @PostMapping("/hello/")
    public String helloWorldWithPostMethod(@RequestBody Object body) {
        return "Hello back with parameter " + body;
    }
}

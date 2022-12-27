package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello back updated 4!!";
    }

    @GetMapping("/hello/{param}")
    public String helloWorldWithParam(@PathVariable Integer param) {
        return "Hello back with param: " + param;
    }
}

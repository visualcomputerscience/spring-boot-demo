package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {

    @GetMapping("/hello/new/controller")
    public String helloWorld() {
        return "Hello back from new controller";
    }

}

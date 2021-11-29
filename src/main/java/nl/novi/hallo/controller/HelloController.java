package nl.novi.hallo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String sayHello() {
        return "Hello World!";
    }
    @GetMapping(value = "/goodbye")
    public String goodbye() {
        return "Goodbye. Have a nice day!";
    }
}

package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

@RestController
public class GreetingController {

    private final GreetingService greetingService;

    @Autowired
    WebApplicationContext ctx;

    @Autowired
    public GreetingController(GreetingService greetingService) {
        System.out.println("***********GreetingController()***********");
        this.greetingService = greetingService;
    }

    @GetMapping("/greet")
    public String greet() {

        return ctx.getBean(GreetingService.class).sayHi();
    }

}

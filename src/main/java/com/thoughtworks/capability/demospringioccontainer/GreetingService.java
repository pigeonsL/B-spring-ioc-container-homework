package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope(value = "prototype")
@Service
public class GreetingService {
    public GreetingService() {
        System.out.println("***********GreetingService()***********");
    }

    String sayHi() {
        return "hello world";
    }
}

package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Service
public class GreetingService {
    public GreetingService() {
        System.out.println("***********GreetingService()***********");
    }

    String sayHi() {
        return "hello world";
    }
}

package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Bar {
    @Autowired
    private Foo foo;

    @PostConstruct
    public void init(){
        foo.setBar(this);
    }
}

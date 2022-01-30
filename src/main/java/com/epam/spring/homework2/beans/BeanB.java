package com.epam.spring.homework2.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanB extends BeanFather {

    public BeanB(String name, String value) {
        super(name, value);
    }
}
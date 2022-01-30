package com.epam.spring.homework2.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanE extends BeanFather {

    public BeanE(String name, String value) {
        super(name, value);
    }
}
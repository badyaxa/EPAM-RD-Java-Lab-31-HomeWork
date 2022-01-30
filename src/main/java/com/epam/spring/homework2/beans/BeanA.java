package com.epam.spring.homework2.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanA extends BeanFather {

    public BeanA(String name, String value) {
        super(name, value);
    }
}
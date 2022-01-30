package com.epam.spring.homework2.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanF extends BeanFather {

    public BeanF(String name, String value) {
        super(name, value);
    }
}
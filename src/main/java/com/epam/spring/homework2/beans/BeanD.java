package com.epam.spring.homework2.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanD extends BeanFather {

    public BeanD(String name, String value) {
        super(name, value);
    }
}
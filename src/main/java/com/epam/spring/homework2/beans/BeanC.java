package com.epam.spring.homework2.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanC extends BeanFather {

    public BeanC(String name, String value) {
        super(name, value);
    }
}
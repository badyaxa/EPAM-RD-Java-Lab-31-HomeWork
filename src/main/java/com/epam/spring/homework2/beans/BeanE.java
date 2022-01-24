package com.epam.spring.homework2.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanE {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private String name;
    private String value;

    public BeanE(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "BeanE{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
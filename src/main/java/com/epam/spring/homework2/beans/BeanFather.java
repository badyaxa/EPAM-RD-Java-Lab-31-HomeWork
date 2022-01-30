package com.epam.spring.homework2.beans;

import org.springframework.stereotype.Component;

//@Component
public class BeanFather {

    private String name;
    private String value;

    public BeanFather(String name, String value) {
        System.out.println("BeanFather.this.getClass().getSimpleName() = " + this.getClass().getSimpleName());
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Bean{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
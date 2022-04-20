package com.epam.spring.homework2.beans;

public class BeanFather {

    private String name;
    private int value;

    public BeanFather(String name, int value) {
        System.out.println("-- BeanFather.this.getClass().getSimpleName() = " + this.getClass().getSimpleName() + "(" + name + ", " + value + ")");
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "toString.BeanFather{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

}
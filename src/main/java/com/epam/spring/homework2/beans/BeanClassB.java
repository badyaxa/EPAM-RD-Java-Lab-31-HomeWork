package com.epam.spring.homework2.beans;

public class BeanClassB extends BeanFather {

    public BeanClassB(String name, int value) {
        super(name, value);
        System.out.println("-- BeanB.this.getClass().getSimpleName() = " + this.getClass().getSimpleName() + "(" + name + ", " + value + ")");
    }

    public void customInitMethodB() {
        System.out.println("-- START -----B-------------- customInitMethodB()");
    }

    public void customDestroyMethodB() {
        System.out.println("-- START -----B-------------- customDestroyMethodB()");
    }

    public void initMethodChangedInCustomBeanFactoryPostProcessorClass() {
        System.out.println("-- START -----B-------------- initMethodChangedInCustomBeanFactoryPostProcessorClass()");
    }

}
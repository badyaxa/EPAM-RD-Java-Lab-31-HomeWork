package com.epam.spring.homework2.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanE extends BeanFather {
    /**
     * 8.	Бін BeanE повинен мати методи з анотаціями @PostConstruct та @PreDestroy.
     * Перебачити відповідні повідомлення з цих методів.
     */
    public BeanE(String name, String value) {
        super(name, value);
        System.out.println("BeanE.this.getClass().getSimpleName() = " + this.getClass().getSimpleName());
    }

    @PostConstruct
    public void postConstructMethod() {
        System.out.println("postConstructMethod = ");
    }

    @PreDestroy
    public void postConstructMethod() {
        System.out.println("postConstructMethod = ");
    }
}
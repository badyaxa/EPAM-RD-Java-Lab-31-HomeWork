package com.epam.spring.homework2.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BeanF extends BeanFather {
    /**
     * 5.	Забезпечити конфігурування біна BeanF з @Lazy ініціалізацією.
     */
    public BeanF(String name, String value) {
        super(name, value);
        System.out.println("BeanF.this.getClass().getSimpleName() = " + this.getClass().getSimpleName());
    }
}
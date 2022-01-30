package com.epam.spring.homework2.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

//@Component
//@Bean()
@DependsOn(value = "beanD")
public class BeanB extends BeanFather {
    /**
     * 2.	Біни BeanB, BeanC, BeanD значення отримують з *.properties файлу
     *
     * 4.	Забезпечити такий порядок створення бінів: BeanD, BeanB, BeanC
     *
     * 6.	При конфігуруванні бінів BeanB, BeanC, BeanD за допомогою @Bean анотації,
     * задати назви користувацьких методів для атрибутів initMethod та destroyMethod,
     * в яких виводити відповідні повідомлення.
     */
    public BeanB(String name, String value) {
        super(name, value);
        System.out.println("BeanB.this.getClass().getSimpleName() = " + this.getClass().getSimpleName());
    }
}
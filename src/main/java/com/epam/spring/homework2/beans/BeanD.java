package com.epam.spring.homework2.beans;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class BeanD extends BeanFather {
    /**
     * 2.	Біни BeanB, BeanC, BeanD значення отримують з *.properties файлу
     *
     * 4.	Забезпечити такий порядок створення бінів: BeanD, BeanB, BeanC
     *
     * 6.	При конфігуруванні бінів BeanB, BeanC, BeanD за допомогою @Bean анотації,
     * задати назви користувацьких методів для атрибутів initMethod та destroyMethod,
     * в яких виводити відповідні повідомлення.
     */
    public BeanD(String name, String value) {
        super(name, value);
        System.out.println("BeanD.this.getClass().getSimpleName() = " + this.getClass().getSimpleName());
    }
}
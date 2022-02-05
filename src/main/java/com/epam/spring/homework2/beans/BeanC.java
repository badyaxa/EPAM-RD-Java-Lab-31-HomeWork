package com.epam.spring.homework2.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component

//Біни BeanB, BeanC, BeanD значення отримують з *.properties файлу
@ConfigurationProperties(prefix = "beanC")

//Забезпечити такий порядок створення бінів: BeanD, BeanB, BeanC
@DependsOn(value = "beanB")
public class BeanC extends BeanFather {
    /**
     * 2.	Біни BeanB, BeanC, BeanD значення отримують з *.properties файлу
     *
     * 4.	Забезпечити такий порядок створення бінів: BeanD, BeanB, BeanC
     *
     * 6.	При конфігуруванні бінів BeanB, BeanC, BeanD за допомогою @Bean анотації,
     * задати назви користувацьких методів для атрибутів initMethod та destroyMethod,
     * в яких виводити відповідні повідомлення.
     */
    public BeanC(String name, String value) {
        super(name, value);
        System.out.println("BeanC.this.getClass().getSimpleName() = " + this.getClass().getSimpleName());
    }
}
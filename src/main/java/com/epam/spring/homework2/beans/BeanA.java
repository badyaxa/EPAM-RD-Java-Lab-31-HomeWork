package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
//@Bean
public class BeanA extends BeanFather implements InitializingBean, DisposableBean {
    /**
     * 7.	Бін BeanA повинен реалізовувати інтерфейси InitializingBean та DisposableBean.
     * Перебачити відповідні повідомлення з реалізованих методів.
     */
    public BeanA(String name, String value) {
        super(name, value);
        System.out.println("BeanA.this.getClass().getSimpleName() = " + this.getClass().getSimpleName());
    }

    @Override
    public void destroy() throws Exception {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
package com.epam.spring.homework2.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanFactoryPostProcessorCustom implements BeanFactoryPostProcessor{
    /**
     * 10.	Створити окремий бін, що реалізовує BeanFactoryPostProcessor.
     * За допомогою нього для біна BeanB змінити параметр initMethod на значення іншого користувацького методу.
     * Передбачити вивід відповідних повідомлень.
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

    }
}
package com.epam.spring.homework2;

import com.epam.spring.homework2.config.BeansConfigMain;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationHW_2 {
    public static void main(String[] args) {
        /**
         * 9.	Вивести перелік усіх бінів, що створені у ApplicationContext.
         * Проаналізувати результати.
         *
         * 12.	Вивести конфігурацію усіх бінів на екран з використанням ApplicationContext.
         */
        ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfigMain.class);
    }
}
package com.epam.spring.homework2.config;

import com.epam.spring.homework2.beans.BeanD;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.epam.spring.homework2")
@Import(BeansConfigSecond.class)
public class BeansConfigMain {
    /**
     * 3.	Створити 2ва файли конфігурації @Configuration, та імпортувати одну конфігурацію в іншу.
     */
    @Bean
    BeanD getBeanD() {
        return new BeanD("name", "value");
    }
}
package com.epam.spring.homework2;

import com.epam.spring.homework2.config.BeansConfigManual;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationHW_2 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeansConfigManual.class);

        System.out.println("================================ MAIN ------------- CONTEXT =================================================");

        System.out.println("-------------------------------- START ============= FOREACH ------------------------------------------------");
        for (String name : context.getBeanDefinitionNames()) {
            System.out.println("---- " + name + " -- context.getBean(name) = " + context.getBean(name));
        }
        System.out.println("------------------------------- END =================== FOREACH --------------------------------------------");

        context.close();
    }
}
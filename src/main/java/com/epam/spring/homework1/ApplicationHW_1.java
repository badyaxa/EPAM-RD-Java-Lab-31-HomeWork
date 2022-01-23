package com.epam.spring.homework1;

import com.epam.spring.homework1.config.BeansConfig;
import com.epam.spring.homework1.pet.Pet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationHW_1 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
        context.getBean(Pet.class).printPets();
        //з контексу бін Cheetah за типом,
        // за іменем біна і проаналізуйте результат
//        System.out.println("context.getBean(Cheetah.class).getClass() = " + context.getBean(Cheetah.class).getClass());
//        context.getBean()
    }
}
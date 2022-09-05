package com.johnson.spring.demo;

import com.johnson.spring.demo.Coach;
import com.johnson.spring.demo.KarateCoach;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AppInjection {
    public static void main(String[] args) {
        // crear container buscando el xml en el classpath
        ApplicationContext ctx = new ClassPathXmlApplicationContext("appContext.xml");

        // pillar bean -> usar la interfaz y hacer downcast
        TennisCoach tennisCoach = (TennisCoach) ctx.getBean("myOtherCoach", Coach.class);

        // usamos bean
        System.out.println("------------- Coach data ------------");
        System.out.println("- Name: " + tennisCoach.getName());
        System.out.println("- Email: " + tennisCoach.getEmail());
        System.out.println("- Training: " + tennisCoach.getTraining());
        System.out.println("- Pronóstico: " + tennisCoach.getFortune());

    }
}

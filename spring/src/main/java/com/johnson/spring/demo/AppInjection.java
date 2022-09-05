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

        // pillar bean -> usar la interfaz
        Coach coach = ctx.getBean("myCoach", Coach.class);

        // usamos bean
        System.out.println(coach.getTraining());
        System.out.println(coach.getFortune());

    }
}

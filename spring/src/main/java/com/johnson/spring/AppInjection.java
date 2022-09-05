package com.johnson.spring;

import com.johnson.spring.demo.Coach;
import com.johnson.spring.demo.KarateCoach;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AppInjection {
    public static void main(String[] args) {
        // crear container buscando el xml en el classpath
        ApplicationContext ctx = new ClassPathXmlApplicationContext("appContext.xml");
        /*
        // crear container buscando el xml en la ruta que se le indique
        ApplicationContext ctx = new FileSystemXmlApplicationContext("src/applicationContext.xml");
        */

        // pillar bean
        Coach coach = ctx.getBean("myCoach", KarateCoach.class);

        // usamos bean
        System.out.println(coach.getTraining());

    }
}

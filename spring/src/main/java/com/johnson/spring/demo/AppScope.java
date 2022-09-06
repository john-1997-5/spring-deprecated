package com.johnson.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppScope {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("appContextScope.xml");

        Coach myCoach = ctx.getBean("myCoach", Coach.class);
        Coach myCoach2 = ctx.getBean("myCoach", Coach.class);
        boolean isSameReference = myCoach == myCoach2;
        System.out.println("¿Misma referencia? -> " + isSameReference);
        System.out.println("- myCoach memory location -> " + myCoach);
        System.out.println("- myCoach2 memory location -> " + myCoach2);
    }
}

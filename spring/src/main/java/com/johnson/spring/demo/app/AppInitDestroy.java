package com.johnson.spring.demo.app;

import com.johnson.spring.demo.Coach;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppInitDestroy {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("appContextScope.xml");

        Coach myCoach = ctx.getBean("myCoach", Coach.class);
        System.out.println(myCoach.getTraining());
        // downcast para tener acceso al método close() y cerrar el container
        ((ClassPathXmlApplicationContext) ctx).close();

    }
}


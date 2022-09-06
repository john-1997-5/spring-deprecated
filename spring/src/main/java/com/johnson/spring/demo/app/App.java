package com.johnson.spring.demo.app;

import com.johnson.spring.demo.BaseballCoach;
import com.johnson.spring.demo.Coach;

public class App {
    public static void main(String[] args) {
        Coach coach = new BaseballCoach();
        System.out.println(coach.getTraining());
    }
}

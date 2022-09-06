package com.johnson.spring.demo;

import com.johnson.spring.demo.dao.BaseballCoach;
import com.johnson.spring.demo.dao.Coach;

public class App {
    public static void main(String[] args) {
        Coach coach = new BaseballCoach();
        System.out.println(coach.getTraining());
    }
}

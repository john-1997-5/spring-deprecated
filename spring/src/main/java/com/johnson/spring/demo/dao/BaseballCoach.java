package com.johnson.spring.demo.dao;

import com.johnson.spring.demo.service.FortuneService;

public class BaseballCoach implements Coach {
    private FortuneService fortuneService;

    public BaseballCoach() {
    }

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getTraining() {
        return "Batea 10000 veces";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}

package com.johnson.spring.demo;

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

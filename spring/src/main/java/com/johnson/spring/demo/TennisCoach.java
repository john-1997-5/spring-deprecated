package com.johnson.spring.demo;

public class TennisCoach implements Coach {
    private FortuneService fortuneService;

    @Override
    public String getTraining() {
        return "10000 backhands and 1000 forehands";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}

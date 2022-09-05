package com.johnson.spring.demo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class TennisCoach implements Coach {
    private FortuneService fortuneService;
    private String name;
    private String email;

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

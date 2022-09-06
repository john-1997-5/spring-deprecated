package com.johnson.spring.demo.dao;

import com.johnson.spring.demo.service.FortuneService;

public class KarateCoach implements Coach {
    private FortuneService fortuneService;

    public KarateCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getTraining() {
        return "Practica 10000 patadas y 10000 puñetazos";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}

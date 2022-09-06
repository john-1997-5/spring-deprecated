package com.johnson.spring.demo;

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

    public void whenStarting(){
        System.out.println(" -> Bean casi listo...");
    }

    public void whenFinished(){
        System.out.println(" -> Container closed..");
    }
}

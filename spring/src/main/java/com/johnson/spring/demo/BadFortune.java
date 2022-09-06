package com.johnson.spring.demo;

public class BadFortune implements FortuneService {

    @Override
    public String getFortune() {

        return "Mi pana te mamaste";
    }
}

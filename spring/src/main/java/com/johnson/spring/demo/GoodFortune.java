package com.johnson.spring.demo;

public class GoodFortune implements FortuneService {

    @Override
    public String getFortune() {
        return "Tendrás buena suerte mi pana";
    }
}

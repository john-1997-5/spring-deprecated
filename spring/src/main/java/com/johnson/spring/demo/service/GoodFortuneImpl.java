package com.johnson.spring.demo.service;

import com.johnson.spring.demo.service.FortuneService;

public class GoodFortuneImpl implements FortuneService {

    @Override
    public String getFortune() {
        return "Tendrás buena suerte mi pana";
    }
}

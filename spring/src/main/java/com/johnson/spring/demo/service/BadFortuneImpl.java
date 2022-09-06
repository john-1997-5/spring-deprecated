package com.johnson.spring.demo.service;

import com.johnson.spring.demo.service.FortuneService;

public class BadFortuneImpl implements FortuneService {

    @Override
    public String getFortune() {

        return "Mi pana te mamaste";
    }
}

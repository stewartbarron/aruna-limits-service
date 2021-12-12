package com.github.stewartbarron.aruna.limitsservice.controller;

import com.github.stewartbarron.aruna.limitsservice.bean.Limits;
import com.github.stewartbarron.aruna.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController   {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits getLimits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}

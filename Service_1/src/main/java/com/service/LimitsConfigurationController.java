package com.service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class LimitsConfigurationController
{
    @Autowired
    private Configuration configuration;
    @GetMapping("/limits")
    public LimitConfiguration retriveLimitsFromConfigurations()
    {
//getting values from the properties file
        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }
}
package com.service;

import org.springframework.beans.factory.annotation.Value;

public class LimitConfiguration
{
    @Value("${limits-service.minimum}")

    private int maximum;
    @Value("${limits-service.maximum}")

    private int minimum;
    //no-argument constructor
    protected LimitConfiguration()
    {
    }
    //generating getters
    public int getMaximum()
    {
        return maximum;
    }
    public int getMinimum()
    {
        return minimum;
    }
    //genetrating constructor using fields
    public LimitConfiguration(int maximum, int minimum)
    {
        super();
        this.maximum = maximum;
        this.minimum = minimum;
    }
}

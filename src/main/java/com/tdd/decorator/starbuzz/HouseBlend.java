package com.tdd.decorator.starbuzz;

public class HouseBlend extends Beverage
{

    public HouseBlend()
    {
        description = "HouseBlend";
    }

    @Override
    public double getCost()
    {
        return 0.89;
    }

}

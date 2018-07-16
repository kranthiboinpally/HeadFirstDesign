package com.tdd.decorator.starbuzz;

public class Espresso extends Beverage
{

    public Espresso()
    {
        description = "Espresso";
    }

    @Override
    public double getCost()
    {
        return 1.99;
    }

}
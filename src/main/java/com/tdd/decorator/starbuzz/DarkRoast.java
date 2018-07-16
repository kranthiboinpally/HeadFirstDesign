package com.tdd.decorator.starbuzz;

public class DarkRoast extends Beverage
{

    public DarkRoast()
    {
        description = "DarkRoast";
    }

    @Override
    public double getCost()
    {
        return 0.99;
    }

}

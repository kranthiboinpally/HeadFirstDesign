package com.tdd.decorator.starbuzz;

public class Milk extends CondimentDecorator
{

    Beverage beverage;

    public Milk(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public String getDescription()
    {
        return beverage.getDescription() + "  Milk";
    }

    @Override
    public double getCost()
    {
        return 0.10 + beverage.getCost();
    }

}

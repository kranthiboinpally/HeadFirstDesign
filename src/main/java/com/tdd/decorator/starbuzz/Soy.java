package com.tdd.decorator.starbuzz;

public class Soy extends CondimentDecorator
{

    Beverage beverage;

    public Soy(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public String getDescription()
    {
        return beverage.getDescription() + "  Soy";
    }

    @Override
    public double getCost()
    {
        return 0.15 + beverage.getCost();
    }

}

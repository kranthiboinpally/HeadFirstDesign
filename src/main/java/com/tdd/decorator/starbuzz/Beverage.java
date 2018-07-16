package com.tdd.decorator.starbuzz;

public abstract class Beverage
{

    String description = "Unknown Beverage";

    public enum Size
    {
        TALL, GRANDE, VENTI
    };

    Size size;

    public String getDescription()
    {
        return description;
    }

    public abstract double getCost();

    public Size getSize()
    {
        return size;
    }

    public void setSize(Size size)
    {
        this.size = size;
    }

}

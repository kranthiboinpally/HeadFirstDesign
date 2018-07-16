package com.tdd.decorator.starbuzz;

public class StarBuzzCoffee
{

    public static void main(String[] args)
    {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "$" + beverage.getCost());

        Beverage beverage2 = new DarkRoast();

        beverage2 = new Milk(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);

        System.out.println(beverage2.getDescription() + "$" + beverage2.getCost());

    }

}

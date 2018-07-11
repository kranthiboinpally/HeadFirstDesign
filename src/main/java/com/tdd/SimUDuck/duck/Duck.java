package com.tdd.SimUDuck.duck;

import com.tdd.SimUDuck.behaviour.FlyBehavior;
import com.tdd.SimUDuck.behaviour.QuackBehavior;

public abstract class Duck
{

    FlyBehavior   flyBehavior;

    QuackBehavior quackBehavior;

    public abstract void display();

    public void swim()
    {
        System.out.println("All duck float, even decoys");
    }

    public FlyBehavior getFlyBehavior()
    {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehaviour)
    {
        this.flyBehavior = flyBehaviour;
    }

    public QuackBehavior getQuackBehavior()
    {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehaviour)
    {
        this.quackBehavior = quackBehaviour;
    }

    public void performFly()
    {
        flyBehavior.fly();
    }

    public void performQuack()
    {
        quackBehavior.quack();
    }

}

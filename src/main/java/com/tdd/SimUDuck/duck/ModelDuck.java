package com.tdd.SimUDuck.duck;

import com.tdd.SimUDuck.behaviour.impl.FlyNoWay;
import com.tdd.SimUDuck.behaviour.impl.FlyWithWings;
import com.tdd.SimUDuck.behaviour.impl.Quack;

public class ModelDuck extends Duck
{

    public ModelDuck()
    {
        super();
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display()
    {
        System.out.println("I'm a real Mallard duck, just like Pinocchio is a real boy");

    }

}

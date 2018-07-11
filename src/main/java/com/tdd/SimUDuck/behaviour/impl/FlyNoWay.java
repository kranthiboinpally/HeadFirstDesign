package com.tdd.SimUDuck.behaviour.impl;

import com.tdd.SimUDuck.behaviour.FlyBehavior;

public class FlyNoWay implements FlyBehavior
{

    @Override
    public void fly()
    {
        System.out.println("I can't fly");

    }

}

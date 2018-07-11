package com.tdd.SimUDuck.behaviour.impl;

import com.tdd.SimUDuck.behaviour.QuackBehavior;

public class Squeak implements QuackBehavior
{

    @Override
    public void quack()
    {
        System.out.println("Squeak");

    }

}

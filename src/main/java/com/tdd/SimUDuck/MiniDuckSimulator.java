package com.tdd.SimUDuck;

import com.tdd.SimUDuck.behaviour.impl.FlyRocketPowred;
import com.tdd.SimUDuck.duck.Duck;
import com.tdd.SimUDuck.duck.MallardDuck;
import com.tdd.SimUDuck.duck.ModelDuck;

public class MiniDuckSimulator
{

    public static void main(String[] args)
    {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowred());
        model.performFly();

    }

}

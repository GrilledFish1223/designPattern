package com.ping.strategy.duck2;

import com.ping.strategy.duck2.Duck;
import com.ping.strategy.duck2.flyImpl.FlyNoWay;
import com.ping.strategy.duck2.quackImpl.Quack;


/**
 * @Author:Zhangsp
 * @Description:
 * @Date: Created in 22:49 2018/11/13
 * @Modified By:
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quckBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a model duck!");
    }
}

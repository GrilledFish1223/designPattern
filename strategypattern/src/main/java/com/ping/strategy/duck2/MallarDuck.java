package com.ping.strategy.duck2;

import com.ping.strategy.duck2.quackImpl.Quack;

/**
 * @Author:Zhangsp
 * @Description:
 * @Date: Created in 0:30 2018/11/13
 * @Modified By:
 */
public class MallarDuck extends Duck {
    public MallarDuck() {
        quckBehavior = new Quack();

    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck!");
    }
}

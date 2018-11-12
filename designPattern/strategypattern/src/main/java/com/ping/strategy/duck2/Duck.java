package com.ping.strategy.duck2;

/**
 * @Author:Zhangsp
 * @Description:
 * @Date: Created in 0:19 2018/11/9
 * @Modified By:
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuckBehavior quckBehavior;

    public Duck() {
    }

    public void performQuack() {
        quckBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("All ducks float,even decoys");
    }

    public abstract void display();
}

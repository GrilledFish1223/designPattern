package com.ping.strategy.duck2;

/**
 * @Author:Zhangsp
 * @Description:
 * @Date: Created in 0:19 2018/11/9
 * @Modified By:
 */
public class Duck {
    FlyBehavior flyBehavior;
    QuckBehavior quckBehavior;

    public void performQuack() {
        quckBehavior.quack();
    }

    public void performFly() {

    }

    public void swim() {

    }

    public void display() {

    }
}

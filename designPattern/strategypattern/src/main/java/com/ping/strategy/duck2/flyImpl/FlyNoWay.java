package com.ping.strategy.duck2.flyImpl;

import com.ping.strategy.duck2.FlyBehavior;

/**
 * @Author:Zhangsp
 * @Description:
 * @Date: Created in 0:09 2018/11/9
 * @Modified By:
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm can't fly");
    }
}

package com.ping.strategy.duck2.flyImpl;

import com.ping.strategy.duck2.FlyBehavior;

/**
 * @Author:Zhangsp
 * @Description:
 * @Date: Created in 23:30 2018/11/13
 * @Modified By:
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}

package com.ping.strategy.duck2.flyImpl;

import com.ping.strategy.duck2.FlyBehavior;

/**
 * @Author:Zhangsp
 * @Description:
 * @Date: Created in 0:07 2018/11/9
 * @Modified By:
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}

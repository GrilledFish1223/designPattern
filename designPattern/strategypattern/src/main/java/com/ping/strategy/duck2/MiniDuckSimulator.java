package com.ping.strategy.duck2;

import com.ping.strategy.duck2.flyImpl.FlyRocketPowered;

/**
 * @Author:Zhangsp
 * @Description: test duck
 * @Date: Created in 0:42 2018/11/13
 * @Modified By:
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallarDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}

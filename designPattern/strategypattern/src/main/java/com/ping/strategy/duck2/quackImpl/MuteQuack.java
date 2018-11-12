package com.ping.strategy.duck2.quackImpl;

import com.ping.strategy.duck2.QuckBehavior;

/**
 * @Author:Zhangsp
 * @Description:
 * @Date: Created in 0:11 2018/11/9
 * @Modified By:
 */
public class MuteQuack implements QuckBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}

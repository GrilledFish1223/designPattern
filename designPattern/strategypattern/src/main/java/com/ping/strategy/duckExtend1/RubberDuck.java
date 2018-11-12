package com.ping.strategy.duckExtend1;

/**
 * @Author:Zhangsp
 * @Description:
 * @Date: Created in 23:45 2018/11/8
 * @Modified By:
 */
public class RubberDuck extends Duck {
    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }

    @Override
    public void display() {
        System.out.println("外观是橡皮鸭");
    }
}

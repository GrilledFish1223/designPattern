/**
 * unisinsight.com
 * Copyright (C) 2018-2019 All Rights Reserved.
 */
package com.ping.factorypattern.factorymethod;

/**
 * @version $Id CustomerTest.java, v 1.0 2019-04-30 15:12 zsp $$
 * @author: zhangsp
 */

public class CustomerTest {
    public static void main(String[] args) {
        FactoryBmw320 factoryBmw320 = new FactoryBmw320();
        Bwm320 bwm320 = factoryBmw320.createBmw();
        System.out.println(bwm320);

        FactoryBmw523 factoryBmw523 = new FactoryBmw523();
        Bwm523 bwm523 = factoryBmw523.createBmw();
        System.out.println(bwm523);
    }
}

/**
 * unisinsight.com
 * Copyright (C) 2018-2019 All Rights Reserved.
 */
package com.ping.factorypattern.factorymethod;

/**
 * @version $Id FactoryBmw523.java, v 1.0 2019-04-30 15:11 zsp $$
 * @author: zhangsp
 */

public class FactoryBmw523 implements FactoryBmw {
    @Override
    public Bwm523 createBmw() {
        return new Bwm523();
    }
}

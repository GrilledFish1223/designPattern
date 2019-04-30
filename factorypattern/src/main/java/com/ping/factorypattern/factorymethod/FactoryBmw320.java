/**
 * unisinsight.com
 * Copyright (C) 2018-2019 All Rights Reserved.
 */
package com.ping.factorypattern.factorymethod;

/**
 * @version $Id FactoryBmw320.java, v 1.0 2019-04-30 15:08 zsp $$
 * @author: zhangsp
 */

public class FactoryBmw320 implements FactoryBmw {
    @Override
    public Bwm320 createBmw() {
        return new Bwm320();
    }
}

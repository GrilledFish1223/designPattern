/**
 * unisinsight.com
 * Copyright (C) 2018-2019 All Rights Reserved.
 */
package com.ping.factorypattern.abstractfactory;

/**
 * @version $Id FactoryBMW523.java, v 1.0 2019-04-30 15:25 zsp $$
 * @author: zhangsp
 */

public class FactoryBMW523 implements AbstractFactory {
    @Override
    public Engine createEngine() {
        return new EngineB();
    }

    @Override
    public Aircondition createAircondition() {
        return new AirconditionB();
    }
}

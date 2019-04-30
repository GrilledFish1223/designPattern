/**
 * unisinsight.com
 * Copyright (C) 2018-2019 All Rights Reserved.
 */
package com.ping.factorypattern.abstractfactory;

/**
 * @version $Id TestMain.java, v 1.0 2019-04-30 15:25 zsp $$
 * @author: zhangsp
 */

public class TestMain {
    public static void main(String[] args) {
        //生产宝马320系列配件
        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
        factoryBMW320.createEngine();
        factoryBMW320.createAircondition();

        //生产宝马523系列配件
        FactoryBMW523 factoryBMW523 = new FactoryBMW523();
        factoryBMW523.createEngine();
        factoryBMW523.createAircondition();

    }
}

/**
 * unisinsight.com
 * Copyright (C) 2018-2019 All Rights Reserved.
 */
package com.ping.factorypattern.simpleFactory;

/**
 * @version $Id TestSimpleFactory.java, v 1.0 2019-04-30 14:50 zsp $$
 * @author: zhangsp
 */

public class TestSimpleFactory {
    public static void main(String[] args) {
        BaseNoodles noodles = SimpleNoodleFactory.createNoodles(SimpleNoodleFactory.TYPE_LZ);
        noodles.desc();
        System.out.println("-------------------------------------");
        BaseNoodles lzNoodle = SimpleNoodleFactory.createNoodles1(LzNoodles.class);
        lzNoodle.desc();
    }
}

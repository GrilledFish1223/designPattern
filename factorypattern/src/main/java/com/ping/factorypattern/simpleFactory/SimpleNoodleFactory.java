/**
 * unisinsight.com
 * Copyright (C) 2018-2019 All Rights Reserved.
 */
package com.ping.factorypattern.simpleFactory;

/**
 *
 * 简单工厂类
 *
 * @version $Id SimpleNoodleFactory.java, v 1.0 2019-04-30 14:38 zsp $$
 * @author: zhangsp
 */

public class SimpleNoodleFactory {
    public static final int TYPE_LZ = 1;
    public static final int TYPE_GK = 2;

    public static BaseNoodles createNoodles(int type) {
        switch (type) {
            case TYPE_LZ:
                return new LzNoodles();
            case TYPE_GK:
                return new GkNoodles();
                default:
                    return null;
        }
    }

    public static <T extends BaseNoodles> T createNoodles1(Class<T> clz) {
        T result = null;
        try {
            result = (T) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}

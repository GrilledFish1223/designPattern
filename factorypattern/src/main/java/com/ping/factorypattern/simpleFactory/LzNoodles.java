/**
 * unisinsight.com
 * Copyright (C) 2018-2019 All Rights Reserved.
 */
package com.ping.factorypattern.simpleFactory;

/**
 *
 * 具体产品类
 *
 * @version $Id LzNoodles.java, v 1.0 2019-04-30 14:35 zsp $$
 * @author: zhangsp
 */

public class LzNoodles extends BaseNoodles {
    @Override
    public void desc() {
        System.out.println("兰州拉面");
    }
}

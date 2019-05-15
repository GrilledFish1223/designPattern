/**
 * unisinsight.com
 * Copyright (C) 2018-2019 All Rights Reserved.
 */
package com.ping.adapterpattern.classadapter;

/**
 * 具体目标类，只提供普通功能
 *
 * @version $Id ConcreteTarget.java, v 1.0 2019-05-15 19:47 zsp $$
 * @author: zhangsp
 */

public class ConcreteTarget implements Target{
    @Override
    public void request() {
        System.out.println("普通类 具有 普通功能...");
    }
}

/**
 * unisinsight.com
 * Copyright (C) 2018-2019 All Rights Reserved.
 */
package com.ping.adapterpattern.classadapter;

/**
 * @version $Id Client.java, v 1.0 2019-05-15 19:51 zsp $$
 * @author: zhangsp
 */

public class Client {
    public static void main(String[] args) {
        // 普通功能
        Target target = new ConcreteTarget();
        target.request();

        // 使用特殊功能，适配类
        Target adapter = new Adapter(new Adaptee());
        adapter.request();
    }
}

/**
 * unisinsight.com
 * Copyright (C) 2018-2019 All Rights Reserved.
 */
package com.ping.adapterpattern.classadapter;

/**
 * 适配器类，继承了被适配类，同时实现标准接口
 *
 * @version $Id Adapter.java, v 1.0 2019-05-15 19:49 zsp $$
 * @author: zhangsp
 */
public class Adapter /*extends Adaptee*/ implements Target{

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        this.adaptee.specficReques();
    }
}

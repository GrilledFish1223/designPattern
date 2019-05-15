/**
 * unisinsight.com
 * Copyright (C) 2018-2019 All Rights Reserved.
 */
package com.ping.adapterpattern.classadapter;

/**
 * 已存在的、具有特殊功能、但不符合我们既有的标准接口的类
 *
 * @version $Id Adaptee.java, v 1.0 2019-05-15 19:42 zsp $$
 * @author: zhangsp
 */

public class Adaptee {
    public void specficReques() {
        System.out.println("被适配类具有 特殊功能...");
    }

}

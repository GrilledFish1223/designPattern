/**
 * unisinsight.com
 * Copyright (C) 2018-2019 All Rights Reserved.
 */
package com.ping.factorypattern.abstractfactory;

/**
 * @author zsp
 * @version $Id AbstractFactory.java, v 1.0 2019-04-30 15:23 zsp Vl $$
 */
public interface AbstractFactory {

    /**
     * 创建CPU对象
     * @return CPU对象
     */
    Cpu createCpu();

    /**
     * 创建主板对象
     * @return 主板对象
     */
    Mainboard createMainboard();

}

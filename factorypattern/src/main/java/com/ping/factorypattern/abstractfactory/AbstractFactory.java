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
    //制造发动机
    public Engine createEngine();
    //制造空调
    public Aircondition createAircondition();
}

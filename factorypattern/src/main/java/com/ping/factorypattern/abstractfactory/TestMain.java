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
        //创建装机工程师对象
        ComputerEngineer cf = new ComputerEngineer();
        //客户选择需要的产品
        AbstractFactory af = new IntelFactory();
        cf.makeComputer(af);

    }
}

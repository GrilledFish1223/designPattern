package com.ping.factorypattern.abstractfactory;

/**
 * @version $Id AmdFactory.java, v 1.0 2019-06-20 10:39 zsp $$
 * @author: zhangsp
 */

public class AmdFactory implements AbstractFactory {
    @Override
    public Cpu createCpu() {
        return new IntelCpu(938);
    }

    @Override
    public Mainboard createMainboard() {
        return new IntelMainboard(938);
    }
}

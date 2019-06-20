package com.ping.factorypattern.abstractfactory;

/**
 * @version $Id IntelFactory.java, v 1.0 2019-06-20 10:30 zsp $$
 * @author: zhangsp
 */

public class IntelFactory implements AbstractFactory {
    @Override
    public Cpu createCpu() {
        return new IntelCpu(755);
    }

    @Override
    public Mainboard createMainboard() {
        return new IntelMainboard(755);
    }
}

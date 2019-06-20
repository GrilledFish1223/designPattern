package com.ping.factorypattern.abstractfactory;

/**
 * @version $Id IntelCpu.java, v 1.0 2019-06-20 10:31 zsp $$
 * @author: zhangsp
 */

public class IntelCpu implements Cpu {
    /**
     * CPU的针脚数
     */
    private int pins;
    public  IntelCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("Intel CPU的针脚数：" + pins);
    }
}

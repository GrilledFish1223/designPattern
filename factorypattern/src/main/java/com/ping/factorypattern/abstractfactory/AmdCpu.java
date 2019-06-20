package com.ping.factorypattern.abstractfactory;

/**
 * @version $Id AmdCpu.java, v 1.0 2019-06-20 10:33 zsp $$
 * @author: zhangsp
 */

public class AmdCpu implements Cpu{
    /**
     * CPU的针脚数
     */
    private int pins = 0;
    public  AmdCpu(int pins){
        this.pins = pins;
    }
    @Override
    public void calculate() {
        System.out.println("AMD CPU的针脚数：" + pins);
    }
}

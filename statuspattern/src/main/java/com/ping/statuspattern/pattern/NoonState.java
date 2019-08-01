package com.ping.statuspattern.pattern;

/**
 * @version $Id NoonState.java, v 1.0 2019-07-31 15:21 zsp $$
 * @author: zhangsp
 */

public class NoonState extends AbstractState {
    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 13) {
            System.out.println("当前时间：" +  w.getHour() + "点 午休");
        } else {
            w.setCurrent(new AfternoonState());
            w.writeProgram();
        }
    }
}

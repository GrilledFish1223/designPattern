package com.ping.statuspattern.pattern;

/**
 * @version $Id ForenoonState.java, v 1.0 2019-07-31 15:18 zsp $$
 * @author: zhangsp
 */

public class ForenoonState extends AbstractState {
    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 12) {
            System.out.println("当前时间：" +  w.getHour() + "点  上午工作");
        } else {
            w.setCurrent(new NoonState());
            w.writeProgram();
        }
    }
}

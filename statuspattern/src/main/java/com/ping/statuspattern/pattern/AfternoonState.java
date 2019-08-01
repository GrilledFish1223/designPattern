package com.ping.statuspattern.pattern;

/**
 * @version $Id AfternoonState.java, v 1.0 2019-07-31 15:26 zsp $$
 * @author: zhangsp
 */

public class AfternoonState extends AbstractState {
    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 17) {
            System.out.println("当前时间：" +  w.getHour() + "点 下午");
        } else {


        }
    }
}

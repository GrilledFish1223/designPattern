package com.ping.statuspattern.pattern;

/**
 * @version $Id Work.java, v 1.0 2019-07-31 15:15 zsp $$
 * @author: zhangsp
 */

public class Work {
    private AbstractState current;

    private double hour;
    private boolean finish = false;
    public Work() {
        this.current = new ForenoonState();
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public AbstractState getCurrent() {
        return current;
    }

    public void setCurrent(AbstractState current) {
        this.current = current;
    }

    public void  writeProgram() {
        current.writeProgram(this);
    }
}

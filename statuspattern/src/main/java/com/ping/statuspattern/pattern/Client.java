package com.ping.statuspattern.pattern;

/**
 * @version $Id Client.java, v 1.0 2019-07-31 15:32 zsp $$
 * @author: zhangsp
 */

public class Client {
    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(9);
        work.writeProgram();

        work.setHour(13);
        work.writeProgram();

        work.setHour(17);
        work.writeProgram();
    }
}

/**
 * unisinsight.com
 * Copyright (C) 2018-2019 All Rights Reserved.
 */
package com.ping.commandpattern.comm;

/**
 * @version $Id ConcreteCommand.java, v 1.0 2019-05-15 14:23 zsp $$
 * @author: zhangsp
 */

public class ConcreteCommand extends Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    void execute() {
        this.receiver.dosomething();
    }
}

/**
 * unisinsight.com
 * Copyright (C) 2018-2019 All Rights Reserved.
 */
package com.ping.commandpattern.comm;

/**
 * @version $Id Invoker.java, v 1.0 2019-05-15 14:21 zsp $$
 * @author: zhangsp
 */

public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }
}

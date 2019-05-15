/**
 * unisinsight.com
 * Copyright (C) 2018-2019 All Rights Reserved.
 */
package com.ping.commandpattern.light;

/**
 * The Command for turning off the light - ConcreteCommand #2
 *
 * @version $Id FlipDownCommand.java, v 1.0 2019-05-15 14:37 zsp $$
 * @author: zhangsp
 */

public class FlipDownCommand implements BaseCommand {
    private Light light;

    public FlipDownCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}

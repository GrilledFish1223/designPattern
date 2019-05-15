/**
 * unisinsight.com
 * Copyright (C) 2018-2019 All Rights Reserved.
 */
package com.ping.commandpattern.light;

/**
 * The Command for turning on the light - ConcreteCommand #1
 *
 * @version $Id FlipUpCommand.java, v 1.0 2019-05-15 14:35 zsp $$
 * @author: zhangsp
 */

public class FlipUpCommand implements BaseCommand {
    private Light light;

    public FlipUpCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

}

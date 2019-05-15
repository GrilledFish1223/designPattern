/**
 * unisinsight.com
 * Copyright (C) 2018-2019 All Rights Reserved.
 */
package com.ping.commandpattern.light;

/**
 * The test class or client
 *
 * @version $Id PressSwitch.java, v 1.0 2019-05-15 14:38 zsp $$
 * @author: zhangsp
 */

public class PressSwitch {
    public static void main(String[] args) {
        Light light = new Light();
        BaseCommand switchUp = new FlipDownCommand(light);
        BaseCommand switchDown = new FlipDownCommand(light);

        Switch s = new Switch();

        try {
            if ("ON".equalsIgnoreCase(args[0])) {
                s.storeAndExecute(switchUp);
            } else if ("OFF".equalsIgnoreCase(args[0])) {
                s.storeAndExecute(switchDown);
            } else {
                System.out.println("Argument \\\"ON\\\" or \\\"OFF\\\" is required.");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

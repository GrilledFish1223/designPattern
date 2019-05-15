/**
 * unisinsight.com
 * Copyright (C) 2018-2019 All Rights Reserved.
 */
package com.ping.commandpattern.light;

import java.util.ArrayList;
import java.util.List;

/**
 * The invoke class
 *
 * @version $Id Switch.java, v 1.0 2019-05-15 14:31 zsp $$
 * @author: zhangsp
 */

public class Switch {
    private List<BaseCommand> history =new ArrayList<>();

    public Switch() {
    }

    public void storeAndExecute(BaseCommand command) {
        this.history.add(command);
        command.execute();
    }


}

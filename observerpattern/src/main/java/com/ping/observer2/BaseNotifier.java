/**
 * unisinsight.com
 * Copyright (C) 2018-2019 All Rights Reserved.
 */
package com.ping.observer2;



/**
 * 通知者抽象
 * @version $Id BaseNotifier.java, v 1.0 2019-04-24 10:56 zsp $$
 * @author: zhangsp
 */

public  abstract class BaseNotifier {

    private EventHandler eventHandler = new EventHandler();

    public EventHandler getEventHandler() {
        return eventHandler;
    }

    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    public abstract void addListener(Object o, String methonName, Object... args);

    public abstract void notifyU();
}

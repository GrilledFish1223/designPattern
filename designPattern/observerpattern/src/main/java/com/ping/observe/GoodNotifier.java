/**
 * unisinsight.com
 * Copyright (C) 2018-2019 All Rights Reserved.
 */
package com.ping.observe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @version $Id GoodNotifier.java, v 1.0 2019-04-24 11:19 zsp $$
 * @author: zhangsp
 */

public class GoodNotifier extends Notifier {

    private static final Logger LOGGER = LoggerFactory.getLogger(GoodNotifier.class);

    @Override
    public EventHandler getEventHandler() {
        return super.getEventHandler();
    }

    @Override
    public void setEventHandler(EventHandler eventHandler) {
        super.setEventHandler(eventHandler);
    }

    @Override
    public void addListener(Object o, String methondName, Object... args) {
        System.out.println("有新的委托人了");
        EventHandler handler = this.getEventHandler();
        handler.addEvent(o, methondName, args);
    }

    @Override
    public void notifyU() {
        System.out.println("哨兵通知：有新消息来了");
        try {
            this.getEventHandler().notifyUser();
        } catch (Exception e) {
            LOGGER.error("notify error: {}", e);
        }
    }
}

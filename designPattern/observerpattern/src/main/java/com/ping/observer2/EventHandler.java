/**
 * unisinsight.com
 * Copyright (C) 2018-2019 All Rights Reserved.
 */
package com.ping.observer2;

import java.util.ArrayList;
import java.util.List;

/**
 * 事件处理者
 * @version $Id EventHandler.java, v 1.0 2019-04-24 10:58 zsp $$
 * @author: zhangsp
 */

public class EventHandler {
    private List<Event> objects;

    public EventHandler() {
        objects = new ArrayList<>();
    }

    /**
     * 添加对象要执行事件
     * @param object
     * @param methonName
     * @param args
     */
    public void addEvent(Object object, String methonName, Object...args) {
        objects.add(new Event(object,methonName,args));
    }

    /**
     * 通知所有对象执行指定的事件
     * @throws Exception
     */
    public void notifyUser() throws Exception {
        for (Event object : objects) {
            object.invoke();
        }
    }
}

/**
 * unisinsight.com
 * Copyright (C) 2018-2019 All Rights Reserved.
 */
package com.ping.observer2;

/**
 * @version $Id UserWeChat.java, v 1.0 2019-04-24 11:54 zsp $$
 * @author: zhangsp
 */

public class UserWeChat implements Observer {

    private String name;

    private  String messgge;

    public UserWeChat(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        this.messgge = msg;
        read();
    }

    public void read() {
        System.out.println(name + " 收到推送消息： " + messgge);
    }
}

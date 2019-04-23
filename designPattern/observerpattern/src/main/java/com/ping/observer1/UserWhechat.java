package com.ping.observer1;

import com.ping.observe.Observer;

public class UserWhechat implements Observer {

    private String name;

    private  String messgge;

    public UserWhechat(String name) {
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

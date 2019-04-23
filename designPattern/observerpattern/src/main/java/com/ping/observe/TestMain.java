package com.ping.observe;

import com.ping.observer1.UserWhechat;

public class TestMain {
    public static void main(String[] args) {
        WechatServer server = new WechatServer();

        Observer u1 = new UserWhechat("zhang");

        Observer u2 = new UserWhechat("li");

        Observer u3 = new UserWhechat("wang");

        server.registerObserver(u1);
        server.registerObserver(u2);
        server.registerObserver(u3);
        server.setInfomation("Java is good");

        System.out.println("----------------------------");
        server.registerObserver(u3);
        server.setInfomation("Pram is nice");
    }
}

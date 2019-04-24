package com.ping.observe;

public class TestMain {
    public static void main(String[] args) {
        WechatServer server = new WechatServer();

        Observer u1 = new UserWeChat("zhang");

        Observer u2 = new UserWeChat("li");

        Observer u3 = new UserWeChat("wang");

        server.registerObserver(u1);
        server.registerObserver(u2);
        server.registerObserver(u3);
        server.setInfomation("Java is good");

        System.out.println("----------------------------");
        server.registerObserver(u3);
        server.setInfomation("Pram is nice");

    }
}

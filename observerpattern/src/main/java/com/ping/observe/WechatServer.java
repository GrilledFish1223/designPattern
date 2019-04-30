package com.ping.observe;

import java.util.ArrayList;
import java.util.List;

public class WechatServer implements Observerable {

    private List<Observer> list;

    private String message;

    public WechatServer() {
        list = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (!list.isEmpty()) {
            list.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : list) {
            observer.update(message);
        }
    }

    public void setInfomation(String str) {
        this.message = str;
        System.out.println("微信服务消息更新：" + str);

        notifyObserver();
    }
}

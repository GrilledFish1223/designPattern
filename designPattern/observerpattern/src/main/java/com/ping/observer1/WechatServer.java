package com.ping.observer1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:Zhangsp
 * @Description: 被观察者
 * @Date: Created in 22:39 2018/11/14
 * @Modified By:
 */
public class WechatServer implements Subject{
    private List<Observer> list;
    private String message;

    public WechatServer() {
        list = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (!list.isEmpty()) {
            list.remove(o);
        }
    }

    @Override
    public void nofityObserver() {
        for (Observer observer : list) {
            observer.updateWechat(message);
        }
    }

    public void setInformation(String s) {
        this.message = s;
        System.out.println("服务更新消息： " + s);
        //消息更新，通知所有观察者
        nofityObserver();
    }
}

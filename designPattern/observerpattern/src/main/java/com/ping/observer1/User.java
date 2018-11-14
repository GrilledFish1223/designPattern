package com.ping.observer1;

/**
 * @Author:Zhangsp
 * @Description:
 * @Date: Created in 22:48 2018/11/14
 * @Modified By:
 */
public class User implements Observer {
    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {

    }

    @Override
    public void updateWechat(String message) {
        this.message = message;
        read();
    }

    private void read() {
        System.out.println(name + " 收到消息： " + message);
    }
}

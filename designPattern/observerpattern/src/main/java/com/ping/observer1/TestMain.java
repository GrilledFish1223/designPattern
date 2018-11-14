package com.ping.observer1;

/**
 * @Author:Zhangsp
 * @Description:
 * @Date: Created in 22:52 2018/11/14
 * @Modified By:
 */
public class TestMain {
    public static void main(String[] args) {
        WechatServer server = new WechatServer();
        Observer user1 = new User("林月如");
        Observer user2 = new User("李逍遥");
        Observer fd = new User("杜凡");

        server.registerObserver(user1);
        server.registerObserver(user2);
        server.registerObserver(fd);
        server.setInformation("java是世界上最好的语言");



    }
}

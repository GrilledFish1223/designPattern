/**
 * unisinsight.com
 * Copyright (C) 2018-2019 All Rights Reserved.
 */
package com.ping.observer2;


/**
 * @version $Id TestEventMain.java, v 1.0 2019-04-24 12:03 zsp $$
 * @author: zhangsp
 */

public class TestEventMain {
    public static void main(String[] args) {
        //创建一个尽职尽责的放哨者
        BaseNotifier goodBaseNotifier =new GoodBaseNotifier();

        WechatServer wechatServer=new WechatServer();

        UserWeChat user1 =new UserWeChat("li");

        goodBaseNotifier.addListener(user1, "update", String.class);
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }
    goodBaseNotifier.notifyU();
    }

}

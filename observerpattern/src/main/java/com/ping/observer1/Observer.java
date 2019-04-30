package com.ping.observer1;

/**
 * @Author:Zhangsp
 * @Description: 抽象观察者
 * @Date: Created in 0:02 2018/11/14
 * @Modified By:
 */
public interface Observer {
    /**
     *   当被观察者调用notifyObservers()方法时，观察者的update()方法被回调
     */
    public void update(float temperature,float humidity,float pressure);

    public void updateWechat(String message);
}

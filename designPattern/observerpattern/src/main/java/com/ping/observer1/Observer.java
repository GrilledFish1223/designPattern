package com.ping.observer1;

/**
 * @Author:Zhangsp
 * @Description:
 * @Date: Created in 0:02 2018/11/14
 * @Modified By:
 */
public interface Observer {
    public void update(float temp,float humidity,float pressure);
}

package com.ping.observer1;

/**
 * @Author:Zhangsp
 * @Description:
 * @Date: Created in 23:55 2018/11/13
 * @Modified By:
 */
public interface Subject {
   public void registerObserver(Observer o);
   public void removeObserver(Observer o);
   public void nofityObserver();
}

package com.ping.observer1;

/**
 * @Author:Zhangsp
 * @Description: 抽象被观察者接口
 * @Date: Created in 23:55 2018/11/13
 * @Modified By:
 */
public interface Subject {
   /**
    * 添加
    * @param o
    */
   public void registerObserver(Observer o);

   /**
    * 删除
    * @param o
    */
   public void removeObserver(Observer o);

   /**
    * 通知观察者方法
    */
   public void nofityObserver();
}

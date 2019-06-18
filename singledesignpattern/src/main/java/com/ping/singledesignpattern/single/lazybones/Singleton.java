package com.ping.singledesignpattern.single.lazybones;

/**
 * <p>
 *     不是每次进入getInstance方法都需要同步，而是先不同步，进入方法后，先检查实例是否存在，如果不存在才进行下面的同步块，这是第一
 *     重检查，进入同步块过后，再次检查实例是否存在，如果不存在，就在同步的情况下创建一个实例，这是第二重检查。这样一来，就只需要同步
 *     一次了，从而减少了多次在同步情况下进行判断所浪费的时间。
 * </p>
 * @version $Id Singleton.java, v 1.0 2019-06-18 9:13 zsp $$
 * @author: zhangsp
 */

public class Singleton {
    private volatile static Singleton instance = null;

    private Singleton() {}

    public Singleton getInstance() {
        //先检查实例是否存在，如果不存在才进入下面的同步块
        if (instance == null) {
            synchronized (Singleton.class) {
                //再次检查实例是否存在，如果不存在才真正的创建实例
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return  instance;
    }
}

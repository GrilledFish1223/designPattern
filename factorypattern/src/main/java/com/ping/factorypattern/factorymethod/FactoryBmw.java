/**
 * unisinsight.com
 * Copyright (C) 2018-2019 All Rights Reserved.
 */
package com.ping.factorypattern.factorymethod;

import com.ping.factorypattern.factorymethod.BaseBmw;

/**
 *
 * 工厂类
 *
 * @version $Id FactoryBmw.java, v 1.0 2019-04-30 15:06 zsp $$
 * @author: zhangsp
 */

public interface FactoryBmw {
    BaseBmw createBmw();
}

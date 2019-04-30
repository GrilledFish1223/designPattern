/**
 * unisinsight.com
 * Copyright (C) 2018-2019 All Rights Reserved.
 */
package com.ping.observer2;

import lombok.Data;

import java.lang.reflect.Method;

/**
 * 事件对象
 * @version $Id Event.java, v 1.0 2019-04-24 11:00 zsp $$
 * @author: zhangsp
 */
@Data
public class Event {
    private Object object;

    private String methondName;

    private Object[] params;

    private Class[] paramTypes;

    public Event() {
    }


    public Event(Object object, String methondName, Object ... args) {
        this.object = object;
        this.methondName = methondName;
        this.params = args;
        contractParamTypes(this.params);
    }

    private void contractParamTypes(Object[] params) {
        this.paramTypes = new Class[params.length];
        for (int i = 0; i < params.length; i++) {
            this.paramTypes[i] = params[i].getClass();
        }
    }

    public Object getObject() {
        return object;
    }

    public void  invoke() throws Exception {
        Method method = object.getClass().getMethod(this.getMethondName(),this.getParamTypes());

        if (null == method) {
            return;
        }

        method.invoke(this.getObject(), this.getParams());
    }

}

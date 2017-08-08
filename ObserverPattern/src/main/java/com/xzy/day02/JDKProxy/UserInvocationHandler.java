package com.xzy.day02.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Create by mr.wl on 2017/8/8
 */
public class UserInvocationHandler implements InvocationHandler{

    private Object target;

    public UserInvocationHandler(){}
    public UserInvocationHandler(Object target) {
        this.target = target;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前"+method.getName());
        Object obj = method.invoke(target,args);
        System.out.println("后"+method.getName());
        return obj;

    }
}

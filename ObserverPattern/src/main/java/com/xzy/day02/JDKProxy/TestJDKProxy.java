package com.xzy.day02.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Create by mr.wl on 2017/8/8
 */
public class TestJDKProxy {
    public static void main(String[] args) {

        UserService service = new UserServiceImpl();
        InvocationHandler handler = new UserInvocationHandler(service);
        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(
                service.getClass().getClassLoader(),
                service.getClass().getInterfaces(),handler);

        userServiceProxy.calName("laozhang");
    }
}

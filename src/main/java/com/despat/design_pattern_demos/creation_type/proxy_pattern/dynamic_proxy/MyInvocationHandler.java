package com.despat.design_pattern_demos.creation_type.proxy_pattern.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler<T> implements InvocationHandler {

    T target;

    public MyInvocationHandler(T target) {
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("执行了代理方法");
        MonitorUtil.start();
        Object result = method.invoke(target,args);
        MonitorUtil.finish(method.getName());
        return null;
    }
}

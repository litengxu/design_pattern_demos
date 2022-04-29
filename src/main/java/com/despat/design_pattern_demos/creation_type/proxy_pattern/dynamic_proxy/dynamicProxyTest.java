package com.despat.design_pattern_demos.creation_type.proxy_pattern.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class dynamicProxyTest {


    public static void main(String[] args) {

        Person person = new Student("动态代理测试");
        //创建一个与代理对象相关联的InvocationHandler
        InvocationHandler myInvocationHandler = new  MyInvocationHandler<Person>(person);

        Person stuProxy = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(),
                new Class<?>[]{Person.class},myInvocationHandler);
        stuProxy.identity();
    }
}

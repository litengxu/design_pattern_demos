package com.despat.design_pattern_demos.creation_type.proxy_pattern.static_proxy;


/*
* 通过继承的方式实现静态代理
*
* */
public class UserControllerProxy2 extends UseraController{

    @Override
    public String testStatic(String id) {
        System.out.println("UserControllerProxy2  使用继承的方式 testStatic");
        return super.testStatic(id);
    }
}

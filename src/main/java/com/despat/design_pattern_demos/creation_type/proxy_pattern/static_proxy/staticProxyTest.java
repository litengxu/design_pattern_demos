package com.despat.design_pattern_demos.creation_type.proxy_pattern.static_proxy;

public class staticProxyTest {


    public static void main(String[] args) {

        System.out.println("使用接口重写的方式实现静态代理");
        IUserController userController = new UserControllerProxy(new UseraController());
        userController.testStatic("1");


        System.out.println();
        System.out.println("使用继承的方式实现静态代理");
        UseraController useraController = new UserControllerProxy2();
        useraController.testStatic("2");
    }
}

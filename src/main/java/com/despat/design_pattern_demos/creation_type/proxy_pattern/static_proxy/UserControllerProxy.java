package com.despat.design_pattern_demos.creation_type.proxy_pattern.static_proxy;

public class UserControllerProxy implements IUserController{
    private UseraController useraController;

    public UserControllerProxy(UseraController useraController){
        this.useraController = useraController;
    }

    @Override
    public String testStatic(String id) {
        System.out.println("静态代理执行 before");
        useraController.testStatic(id);
        System.out.println("静态代理执行 after");
        return null;

    }
}

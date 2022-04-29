package com.despat.design_pattern_demos.creation_type.proxy_pattern.static_proxy;

public class UseraController implements IUserController{
    @Override
    public String testStatic(String id) {
        System.out.println("UserContoller执行了 testStatic");
        return "";
    }
}

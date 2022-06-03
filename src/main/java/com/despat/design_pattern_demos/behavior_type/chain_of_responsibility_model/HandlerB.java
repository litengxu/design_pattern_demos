package com.despat.design_pattern_demos.behavior_type.chain_of_responsibility_model;

public class HandlerB implements IHandler{

    @Override
    public boolean handler() {
        System.out.println("执行了handlerB");
        return false;
    }
}

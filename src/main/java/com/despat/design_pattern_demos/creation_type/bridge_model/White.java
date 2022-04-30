package com.despat.design_pattern_demos.creation_type.bridge_model;

public class White implements Color{
    @Override
    public void tu(String shape) {
        System.out.println("桥接模式 白色的"+shape);
    }
}

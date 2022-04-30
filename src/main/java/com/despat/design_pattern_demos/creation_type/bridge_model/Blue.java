package com.despat.design_pattern_demos.creation_type.bridge_model;

public class Blue implements Color{
    @Override
    public void tu(String shape) {
        System.out.println("桥接模式 蓝色的"+shape);
    }
}

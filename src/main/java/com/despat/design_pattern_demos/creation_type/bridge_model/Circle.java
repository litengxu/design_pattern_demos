package com.despat.design_pattern_demos.creation_type.bridge_model;

public class Circle extends Shape{
    @Override
    public void draw() {
        color.tu("圆形");
    }
}

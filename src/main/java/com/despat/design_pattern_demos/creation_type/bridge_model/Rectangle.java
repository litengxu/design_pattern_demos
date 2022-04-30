package com.despat.design_pattern_demos.creation_type.bridge_model;

public class Rectangle extends Shape{
    @Override
    public void draw() {
        color.tu("正方形");
    }
}

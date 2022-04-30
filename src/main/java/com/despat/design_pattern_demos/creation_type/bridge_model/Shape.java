package com.despat.design_pattern_demos.creation_type.bridge_model;

public abstract class Shape {
    Color color;
    public void setColor(Color color){
        this.color = color;
    }

    public abstract void draw();
}

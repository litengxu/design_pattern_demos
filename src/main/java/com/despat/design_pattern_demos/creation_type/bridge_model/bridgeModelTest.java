package com.despat.design_pattern_demos.creation_type.bridge_model;

public class bridgeModelTest {


    public static void main(String[] args) {
        Shape circle = new Circle();
        Color white = new White();
        circle.setColor(white);
        circle.draw();

        Color blue = new Blue();
        circle.setColor(blue);
        circle.draw();
    }
}

package com.despat.design_pattern_demos.creation_type.decorator;

public class MyFileInputStream extends MyInputStream{

    @Override
    void read() {
        System.out.println("被装饰的类 MyFileInputStream");
    }
}

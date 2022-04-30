package com.despat.design_pattern_demos.creation_type.decorator;

public class MyFilterInputStream extends MyInputStream{
    protected MyInputStream myInputStream;

    public MyFilterInputStream(MyInputStream myInputStream) {
        this.myInputStream = myInputStream;
    }

    @Override
    void read() {
        myInputStream.read();
    }
}

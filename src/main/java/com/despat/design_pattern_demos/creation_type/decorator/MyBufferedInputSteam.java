package com.despat.design_pattern_demos.creation_type.decorator;

public class MyBufferedInputSteam extends MyFilterInputStream {

    public MyBufferedInputSteam(MyInputStream myInputStream) {
        super(myInputStream);
    }

    @Override
    void read() {
        System.out.println("添加装饰 === MyBufferedInputSteam");
        myInputStream.read();
    }
}

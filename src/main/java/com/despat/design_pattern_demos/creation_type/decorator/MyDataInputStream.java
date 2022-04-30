package com.despat.design_pattern_demos.creation_type.decorator;

public class MyDataInputStream extends MyFilterInputStream {

    public MyDataInputStream(MyInputStream myInputStream) {
        super(myInputStream);
    }

    @Override
    void read() {
        System.out.println("添加装饰 === MyDataInputStream");
        myInputStream.read();
    }
}

package com.despat.design_pattern_demos.creation_type.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class decoratorTest {


    public static void main(String[] args) throws FileNotFoundException {

       MyInputStream myFileInputStream = new MyFileInputStream();
       System.out.println("装饰器模式 例子1");
       MyFilterInputStream my1 = new MyDataInputStream(myFileInputStream);
       my1.read();

       System.out.println("装饰器模式 例子2");
       MyInputStream my2 = new MyBufferedInputSteam(myFileInputStream);
       my2.read();
    }
}

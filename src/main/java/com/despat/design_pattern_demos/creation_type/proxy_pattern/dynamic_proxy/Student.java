package com.despat.design_pattern_demos.creation_type.proxy_pattern.dynamic_proxy;


/*必须得有一个实现的接口，因为jdk动态代理是通过实现接口的方式进行*/
public class Student implements Person {

    private String name;


    public Student(String name) {
        this.name = name;

    }

    @Override
    public void identity()  {
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("执行完毕");
        }
        System.out.println(" I am student,name =  "+this.name);
    }
}

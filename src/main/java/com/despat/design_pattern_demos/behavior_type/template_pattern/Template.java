package com.despat.design_pattern_demos.behavior_type.template_pattern;

public abstract class Template {

    public final  void templateDemo(){

        System.out.println("固定的逻辑");
        method1();
        method2();
    }
    public abstract void method1();

    public abstract void method2();
}

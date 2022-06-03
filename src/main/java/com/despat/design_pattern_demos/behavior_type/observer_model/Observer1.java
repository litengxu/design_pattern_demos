package com.despat.design_pattern_demos.behavior_type.observer_model;

public class Observer1 implements Observer{
    @Override
    public void update(String a) {
        System.out.println("onserver "+ a);
    }
}

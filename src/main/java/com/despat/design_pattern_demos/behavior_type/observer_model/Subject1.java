package com.despat.design_pattern_demos.behavior_type.observer_model;

import java.util.ArrayList;
import java.util.List;

public class Subject1 implements Subject{
    List<Observer> list = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        list.add(observer);
    }

    @Override
    public void notify(String a) {
        for (Observer observer : list){
            observer.update(a);
        }
    }
}

package com.despat.design_pattern_demos.behavior_type.observer_model;

/*
* 具体的类
* */
public interface Subject {

        void add(Observer observer);

        void notify(String a);
}

package com.despat.design_pattern_demos.behavior_type.observer_model;

public class ObserverModelDemo {
    public static void main(String[] args) {

        Subject1 subject1 = new Subject1();
        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();
        subject1.add(observer1);
        subject1.add(observer2);
        subject1.notify("观察者模式执行");
    }
}

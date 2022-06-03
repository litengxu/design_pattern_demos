package com.despat.design_pattern_demos.behavior_type.strategy_pattern;

public class bubbleSortStrategy implements Strategy{
    @Override
    public void sort() {
        System.out.println("冒泡排序");
    }
}

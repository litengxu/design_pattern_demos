package com.despat.design_pattern_demos.behavior_type.strategy_pattern;

public class quickSortStrategy implements Strategy{
    @Override
    public void sort() {
        System.out.println("快速排序");
    }
}

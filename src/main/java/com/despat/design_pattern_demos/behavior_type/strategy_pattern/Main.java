package com.despat.design_pattern_demos.behavior_type.strategy_pattern;

public class Main {

    public static void main(String[] args) {
        String sortname = "quickSort";
        StrategyFactory.getSort(sortname).sort();
    }
}

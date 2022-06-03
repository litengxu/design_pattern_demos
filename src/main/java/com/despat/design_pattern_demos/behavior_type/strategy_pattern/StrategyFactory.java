package com.despat.design_pattern_demos.behavior_type.strategy_pattern;

import java.util.HashMap;
import java.util.Map;

public class StrategyFactory {

    private static Map<String,Strategy> maps = new HashMap<>();
    static {
        maps.put("bubbleSort",new bubbleSortStrategy());
        maps.put("quickSort",new quickSortStrategy());
    }
    public static Strategy getSort(String sortName){
        return  maps.get(sortName);
    }
}

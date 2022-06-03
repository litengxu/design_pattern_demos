package com.despat.design_pattern_demos.behavior_type.chain_of_responsibility_model;

import java.util.ArrayList;
import java.util.List;

public class HandlerChain {

    private List<IHandler> list = new ArrayList<>();
    public void addHandler(IHandler iHandler){
        list.add(iHandler);
    }
    public void handle(){
        for (IHandler handler:list){
            handler.handler();
        }
    }
}

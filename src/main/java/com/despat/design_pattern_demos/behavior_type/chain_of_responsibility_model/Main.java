package com.despat.design_pattern_demos.behavior_type.chain_of_responsibility_model;


/*
* 责任链模式
*
* */
public class Main{

    public static void main(String[] args) {
        HandlerChain handlerChain = new HandlerChain();
        handlerChain.addHandler(new HandlerA());
        handlerChain.addHandler(new HandlerB());
        handlerChain.handle();
    }

}

package com.despat.design_pattern_demos.creation_type.adapter_design_pattern.one;

public class CDAdaptor extends CD implements ITarget{
    @Override
    public void target() {
        super.cdtest();
    }
}

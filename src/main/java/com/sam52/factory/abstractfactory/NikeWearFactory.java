package com.sam52.factory.abstractfactory;

public class NikeWearFactory implements IWearFactory {
    @Override
    public IShirt createShirt() {
        return new NikeShirt();
    }

    @Override
    public IShoe createShoe() {
        return new NikeShoe();
    }
}

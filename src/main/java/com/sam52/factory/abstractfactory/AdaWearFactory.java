package com.sam52.factory.abstractfactory;

public class AdaWearFactory implements IWearFactory {
    @Override
    public IShirt createShirt() {
        return new AdaShirt();
    }

    @Override
    public IShoe createShoe() {
        return new AdaShoe();
    }
}

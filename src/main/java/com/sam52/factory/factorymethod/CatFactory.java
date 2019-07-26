package com.sam52.factory.factorymethod;

import com.sam52.factory.Cat;
import com.sam52.factory.Dog;
import com.sam52.factory.IPet;

public class CatFactory implements IPetFactory {
    @Override
    public IPet create() {
        return new Cat();
    }
}

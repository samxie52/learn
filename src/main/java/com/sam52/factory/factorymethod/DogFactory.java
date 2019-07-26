package com.sam52.factory.factorymethod;

import com.sam52.factory.Dog;
import com.sam52.factory.IPet;

public class DogFactory implements IPetFactory {
    @Override
    public IPet create() {
        return new Dog();
    }
}

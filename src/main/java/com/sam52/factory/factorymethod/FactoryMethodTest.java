package com.sam52.factory.factorymethod;

import com.sam52.factory.IPet;

public class FactoryMethodTest {

    public static void main(String[] args) {
        IPetFactory factory = new DogFactory();
        IPet pet = factory.create();
    }
}

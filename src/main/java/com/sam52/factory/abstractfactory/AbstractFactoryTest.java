package com.sam52.factory.abstractfactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        IWearFactory factory = new AdaWearFactory();
        factory.createShirt();
        factory.createShoe();
    }
}

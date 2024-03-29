package com.sam52.factory.simplefactory;

import com.sam52.factory.IPet;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        IPet pet = null;
        try {
            pet = simpleFactory.createPet("com.sam52.factory.Dog");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        pet.smile();

    }
}

package com.sam52.factory.simple;

public class SimpleFactory {

//    public IPet createPet(String name) {
//        if ("dog".equals(name)) {
//            return new Dog();
//        } else if ("cat".equals(name)) {
//            return new Cat();
//        }
//        return null;
//    }

    public IPet createPet(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if (null != className && !"".equals(className)) {
            return (IPet) Class.forName(className).newInstance();
        }
        return null;
    }

    public IPet createPet(Class clazz) throws IllegalAccessException, InstantiationException {
        if (null != clazz) {
            return (IPet) clazz.newInstance();
        }
        return null;
    }
}

package com.backslashn.singleton.antireflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//Singleton violation throough reflection
public class MySingletonExample {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        MySingleton instanceOfMySingleton = MySingleton.getInstance();
        MySingleton sameInstanceOfMySingleton = MySingleton.getInstance();
        System.out.println(instanceOfMySingleton == sameInstanceOfMySingleton);

        //get class object through reflection(forName()),
        //getDeclaredConstructor() because getConstructor() returns the public constructor
        //setAccessible(true) to make accessible the private constructor MySingleton()

        Class<?> clazzMySingleton = Class.forName("com.backslashn.singleton.antireflection.MySingleton");
        Constructor<?> constructorMySingleton = clazzMySingleton.getDeclaredConstructor();
        if (!constructorMySingleton.isAccessible()) {
            constructorMySingleton.setAccessible(true);
        }
        //Exception in thread "main" java.lang.reflect.InvocationTargetException
        //Caused by: java.lang.RuntimeException: Use getInstance() to create MySingleton instance. Do not call constructor directly
        MySingleton reflectionInstanceMySingleton = (MySingleton) constructorMySingleton.newInstance();

    }

}

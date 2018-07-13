package com.backslashn.singleton.antireflection;

public class MySingleton {
    //added volatile
    private static volatile MySingleton instance = null;

    private MySingleton(){
        //added non null check to see if it is tried to be called through reflection
        if (instance != null) {
            throw new RuntimeException("Use getInstance() to create MySingleton instance. Do not call constructor directly");
        }
    };

    public static MySingleton getInstance(){
        //double checked locking
        if (instance == null) {
            synchronized (MySingleton.class) {
                if (instance == null) {
                    instance = new MySingleton();
                }
            }
        }
        return instance;
    }

}
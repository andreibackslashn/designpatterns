package com.backslashn.singleton.simple;

public class MySingleton {
    private static MySingleton instance = new MySingleton();
    //if public then anyone can access and create new instances
    private MySingleton(){}

    public static MySingleton getInstance(){
        return instance;
    }

}

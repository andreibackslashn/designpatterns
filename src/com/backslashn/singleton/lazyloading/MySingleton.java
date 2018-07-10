package com.backslashn.singleton.lazyloading;

public class MySingleton {
    //a new instance is not created at class loading
    private static MySingleton instance = null;

    private MySingleton(){};

    public static MySingleton getInstance(){
        if (instance == null) {
            instance = new MySingleton();
        }
    return instance;
//        return (instance==null) ? instance = new MySingleton(): instance;
    }
}
